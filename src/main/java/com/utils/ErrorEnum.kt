package com.utils

/**
 * class
 *
 * @author Five0314
 * @date create in 上午9:53 2017/12/15
 */
class ErrorCode (val code: Int, val message: String){
//    class Account1{
//        val AccountNotExit: Account
//            get() = Account.AccountNotExit
//    }

//    enum class Account(val code: Int, val message: String){
//        AccountNotExit(100000,"账号未注册"),
//        AccountExit(100001, "账号已注册"),
//
//        PasswordError(100002,"密码错误"),
//    }

    // 错误码
    val errorCode: kotlin.Int = code

    // 错误信息
    val errorMessage: kotlin.String = message

//    init {
//        this.errorCode = code
//        this.errorMessage = message
//    }

    /**
     * 账号错误码
     */
    companion object Account{
        val AccountNotExit: ErrorCode
            get() = ErrorCode(100000,"账号未注册")
    }
}