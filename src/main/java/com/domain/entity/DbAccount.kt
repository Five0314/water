package com.domain.entity

import java.util.*
import javax.persistence.*

/**
 * class
 *
 * @author Five0314
 * @date create in 下午2:25 2017/12/14
 */
@Entity
@Table(name = "account")
class DbAccount {

    @Id
    @GeneratedValue
    var id: Int = 0 // ID

    @Column(updatable = false)
    lateinit var accountid: String // 账号编号

    @Column(updatable = false, nullable = false)
    lateinit var uid: String // 用户编号

    @Column(length = 64, nullable = true, updatable = false)
    lateinit var account: String // 账号

    @Column(length = 64)
    var password: String? = null // 密码

    var status: Int = 0 // 状态

    @Column(updatable = false)
    lateinit var createtime: Date // 创建时间

    constructor()

    constructor(accountid: String, uid: String, account: String, password: String?, status: Int, createtime: Date) {
        this.accountid = accountid
        this.uid = uid
        this.account = account
        this.password = password
        this.status = status
        this.createtime = createtime
    }
}