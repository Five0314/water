package com

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cache.annotation.EnableCaching

/**
 * class
 *
 * @author Five0314
 * @date create in 下午5:22 2017/12/14
 */

@SpringBootApplication
@EnableCaching
open class WaterApplication

fun main(args: Array<String>) {
    SpringApplication.run(WaterApplication::class.java, *args)
}
