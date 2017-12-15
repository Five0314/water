package com.service.impl

import com.domain.entity.DbAccount
import com.repository.AccountRepository
import com.service.AccountService
import com.utils.ErrorCode
import com.utils.ResponseResult
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

/**
 * class
 *
 * @author Five0314
 * @date create in 下午3:22 2017/12/14
 */
@Service
class AccountServiceImpl : AccountService {
    @Autowired
    private lateinit var accountRepository:AccountRepository

    /**
     * 登录
     *
     * @param account 账号
     * @param password 密码
     * @return
     */
    override fun login(account: String, password: String): ResponseResult<DbAccount> {
        var dba = this.accountRepository.findByAccount(account)

        if (dba == null){
            return ResponseResult.error(100000,"账号未注册") as ResponseResult<DbAccount>
        }
        else if (!dba.password.equals(password)){
            return ResponseResult.error(100002,"密码错误") as ResponseResult<DbAccount>
        }

//        ErrorCode.Account.AccountNotExit.errorCode

        return ResponseResult.success(dba) as ResponseResult<DbAccount>
    }

    /**
     * 注册
     *
     * @param phone 手机号
     * @param password 密码
     * @return
     */
    override fun register(phone: String, password: String): ResponseResult<DbAccount> {
        var dba = DbAccount(phone, "","",password,0,Date())

        dba = this.accountRepository.save(dba)

        return ResponseResult.success(dba) as ResponseResult<DbAccount>
    }

    /**
     * 修改密码
     *
     * @param uid 用户编号
     * @param oldPassword 旧密码
     * @param newPassword 新密码
     * @return
     */
    override fun changePassword(uid: String, oldPassword: String, newPassword: String): ResponseResult<DbAccount> {
        var dba = this.accountRepository.findByUid(uid)

        if (dba.password.equals(oldPassword)){
            return ResponseResult.error(100001) as ResponseResult<DbAccount>
        }

        return ResponseResult.success(dba) as ResponseResult<DbAccount>
    }
}