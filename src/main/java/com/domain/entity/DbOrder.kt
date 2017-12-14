package com.domain.entity

import java.util.*
import javax.persistence.*

/**
 * class
 *
 * @author Five
 * @date create in 下午5:19 2017/12/12
 */
@Entity
@Table(name = "orderlist")
class DbOrder {
    @Id
    @GeneratedValue
    var id: Int = 0 // ID
//    get() = field
//        set(value) {
//            if (value == 11){
//                field = 111
//            }
//            else{
//                field = 222
//            }
//        }

    @Column(length = 64, nullable = false, updatable = false)
    lateinit var ordernum: String // 订单编号

    @Column(updatable = false)
    lateinit var createtime: Date // 创建时间

    @Column(length = 255)
    var description: String? = null // 描述

}