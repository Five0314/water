package com.service;

import com.domain.DbAccount;
import com.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;


/**
 * class
 *
 * @author Five
 * @date create in 下午3:41 2017/11/30
 */
@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    /**
     * 获取账号信息
     *
     * @param account 账号
     * @return 账号信息
     */
    public DbAccount accountInfo(String account) {
        return accountRepository.findByAccount(account);
    }

    /**
     * 根据用户ID获取账号信息
     *
     * @param uid 用户id
     * @return
     */
    public DbAccount accountInfoByUid(String uid) {

        DbAccount rv = accountRepository.findByUid(uid);

        return rv;
    }

    /**
     * 注册账号
     *
     * @param account
     * @return
     */
    public DbAccount register(String account, String pssword, String uid) {
        DbAccount nv = new DbAccount();
        nv.setAccount(account);
        nv.setPassword(pssword);
        nv.setCreatetime(new Date());
        nv.setStatus(0);
        nv.setUid(uid);

        DbAccount rnv = accountRepository.save(nv);
        return rnv;
    }

    /**
     * 根据用户ID获取账号信息
     *
     * @param password 新密码
     * @param id       ID
     * @param dba      账号实体（可为空）
     * @return
     */
    @Transactional
    public Integer changePassword(String password, Integer id, DbAccount dba) {
        if (dba == null){
            return accountRepository.changedPassword(password, id);
        }
        else{
            dba.setPassword(password);
            dba.setId(id);

            accountRepository.save(dba);

            return 1;
        }
    }

}
