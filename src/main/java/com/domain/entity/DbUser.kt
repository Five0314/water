package com.domain.entity

import java.util.*
import javax.persistence.*

/**
 * class
 *
 * @author Five0314
 * @date create in 下午2:29 2017/12/14
 */
@Entity
@Table(name = "user")
class DbUser {
    @Id
    @GeneratedValue
    var id: Int = 0 // 数据库ID

    @Column(length = 32)
    var uid: String = "" // 用户编号

    @Column(length = 64)
    var nickname: String? = null // 昵称

    var gender: Int = 0 // 性别

    @Column(nullable = true)
    var birthday: Date? = null // 出生日期

    @Column(length = 11)
    var phone: String? = null // 电话

    @Column(length = 64)
    var email: String? = null // 邮箱

    var status: Int = 0 // 状态

    @Column(updatable = false)
    lateinit var createtime: Date // 创建时间
}