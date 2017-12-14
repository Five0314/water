package com.repository

import com.domain.entity.DbUser
import org.springframework.data.jpa.repository.JpaRepository

/**
 * class
 *
 * @author Five0314
 * @date create in 下午2:40 2017/12/14
 */
interface UserRepository : JpaRepository<DbUser, Int> {

}