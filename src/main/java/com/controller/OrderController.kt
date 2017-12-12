package com.controller

import com.domain.DbAccount
import com.domain.DbOrder
import com.repository.AccountRepository
import com.repository.OrderRepository
import com.service.OrderService
import com.utils.ResponseResult
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * class
 *
 * @author Five
 * @date create in 下午4:03 2017/12/12
 */
@RestController
class OrderController {
    @Autowired
    private lateinit var orderService: OrderService

    @GetMapping("/exitOrder")
    fun exitOrder(@RequestParam("orderId") num: String) : ResponseResult<DbOrder>{
        var rv = this.orderService.exitOrder(num)

        if(rv == null){
            return ResponseResult.error(1, "没读取到东西") as ResponseResult<DbOrder>
        }

        rv.id = 11



        return ResponseResult.success(rv) as ResponseResult<DbOrder>
    }
}