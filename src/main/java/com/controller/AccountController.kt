package com.controller

import com.domain.entity.DbAccount
import com.service.AccountService
import com.utils.ResponseResult
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * class
 *
 * @author Five0314
 * @date create in 下午3:37 2017/12/14
 */
@RestController
@RequestMapping("/account")
class AccountController {
    @Autowired
    private lateinit var accountService: AccountService

    /**
     * 登录
     * @param account 账号
     * @param password 密码
     * @return
     */
    @GetMapping(value = "/login")
    fun login(@RequestParam(value = "account") account: String, @RequestParam(value = "password") password: String) : ResponseResult<DbAccount>{
        return this.accountService.login(account, password)
    }

    /**
     * 注册
     * @param account 账号
     * @param password 密码
     * @return
     */
    @PostMapping(value = "/register")
    fun register(@RequestParam(value = "account") account: String, @RequestParam(value = "password") password: String) : ResponseResult<DbAccount>{

        return this.accountService.register(account, password)
    }

    /**
     * 修改密码
     * @param uid 用户编号
     * @param oldPassword 旧密码
     * @param newPassword 新密码
     * @return
     */
    @PostMapping(value = "/changePassword")
    fun changePassword(@RequestParam(value = "uid") uid: String, @RequestParam(value = "oldPassword") oldPassword: String, @RequestParam(value = "newPassword") newPassword: String) : ResponseResult<DbAccount>{

        return this.accountService.changePassword(uid, oldPassword, newPassword)
    }
}