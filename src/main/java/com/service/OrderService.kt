package com.service

import com.domain.entity.DbOrder
import com.repository.OrderRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * class
 *
 * @author Five
 * @date create in 下午4:12 2017/12/12
 */
@Service
class OrderService {
    @Autowired
    private lateinit var orderRepository: OrderRepository

    fun exitOrder(num: String) : DbOrder {
        var rv = this.orderRepository.findByOrdernum(num)

        return rv
    }

}