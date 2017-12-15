package com.repository

import com.domain.entity.DbAccount
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

/**
 * class
 *
 * @author Five0314
 * @date create in 上午9:02 2017/12/15
 */
interface AccountRepository : JpaRepository<DbAccount, Int> {
    /**
     * 通过账号查询
     *
     * @param account 账号
     * @return
     */
    fun findByAccount(account: String): DbAccount

    /**
     * 通过用户ID查询
     *
     * @param uid 用户ID
     * @return
     */
    fun findByUid(uid: String): DbAccount

    /**
     * 更新密码
     *
     * @param password 新密码
     * @param id       用户ID
     */
    @Modifying
    @Query("update DbAccount o set o.password=:password where o.id=:id")
    fun changedPassword(@Param("password") password: String, @Param("id") id: Int?): Int?
}