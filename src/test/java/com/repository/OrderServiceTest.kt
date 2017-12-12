package com.repository

import com.service.OrderService
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

/**
 * class
 *
 * @author Five
 * @date create in 下午4:06 2017/12/12
 */
@RunWith(SpringRunner::class)
@SpringBootTest
//@SpringBootTest(classes = arrayOf(KotlinDemoApplication::class),
//        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class OrderServiceTest{
    @Autowired
    lateinit var orderService: OrderService

    @Test
    fun exitOrderTest(){
        val v = this.orderService.exitOrder("111111")

    }
}