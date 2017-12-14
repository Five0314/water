package com.repository

import com.domain.entity.DbOrder
import org.springframework.data.jpa.repository.JpaRepository

/**
 * class
 *
 * @author Five0314
 * @date create in 下午5:25 2017/12/12
 */
interface OrderRepository : JpaRepository<DbOrder, Int>{
    fun findByOrdernum(num: String) : DbOrder
}