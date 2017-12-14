package com.service

import com.domain.entity.DbAccount
import com.utils.ResponseResult

/**
 * class
 *
 * @author Five0314
 * @date create in 下午3:16 2017/12/14
 */
interface AccountService {

    /**
     * 登录
     *
     * @param account 账号
     * @param password 密码
     * @return
     */
    fun login(account: String, password: String) : ResponseResult<DbAccount>

    /**
     * 注册
     *
     * @param phone 手机号
     * @param password 密码
     * @return
     */
    fun register(phone: String, password: String) : ResponseResult<DbAccount>

    /**
     * 修改密码
     *
     * @param uid 用户编号
     * @param oldPassword 旧密码
     * @param newPassword 新密码
     * @return
     */
    fun changePassword(uid: String, oldPassword: String, newPassword: String) : ResponseResult<DbAccount>
}