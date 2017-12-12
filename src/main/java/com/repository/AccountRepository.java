package com.repository;

import com.domain.DbAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface AccountRepository extends JpaRepository<DbAccount, Integer>{

    /**
     * 通过账号查询
     *
     * @param account 账号
     * @return
     */
    public DbAccount findByAccount(String account);

    /**
     * 通过用户ID查询
     *
     * @param uid 用户ID
     * @return
     */
    public DbAccount findByUid(String uid);

    /**
     * 更新密码
     *
     * @param password 新密码
     * @param id       用户ID
     */
    @Modifying
    @Query("update DbAccount o set o.password=:password where o.id=:id")
    public Integer changedPassword(@Param("password") String password, @Param("id") Integer id) ;

}



