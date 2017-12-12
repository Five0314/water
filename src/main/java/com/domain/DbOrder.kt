package com.domain

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
    var id: Int = 0
//        set(value) {
//            if (value == 11){
//                field = 111
//            }
//            else{
//                field = 222
//            }
//        }

    @Column(length = 64, nullable = false, updatable = false)
    var ordernum: String = ""

    @Column(updatable = false)
    var createtime: Date = Date()

    @Column(length = 255, nullable = true, updatable = true)
    var description: String = ""

//    fun getId(): Int{return this.id}
//    fun setId(nv: Int) {this.id = nv}

//    fun getOrdernum(): String{return this.ordernum}
//    fun setOrdernum(nv: String) {this.ordernum = nv}

//    fun getCreatetime(): Date{return this.createtime}
//    fun setCreatetime(nv: Date) {this.createtime = nv}

//    fun getDescription(): String{return this.description}
//    fun setDescription(nv: String) {this.description = nv}

}