package com.service

import com.domain.entity.DbUser
import com.repository.UserRepository
import com.utils.ResponseResult
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * class
 *
 * @author Five0314
 * @date create in 下午2:38 2017/12/14
 */
@Service
class UserService {
    @Autowired
    private lateinit var userRepository: UserRepository

    /**
     * 根据ID查询用户
     */
    fun findUser(id: Int) : ResponseResult<DbUser>{
        var v = this.userRepository.findOne(id)

        if (v == null){
            return ResponseResult.error(1,"没有找到该用户") as ResponseResult<DbUser>
        }else {
            return ResponseResult.success(v) as ResponseResult<DbUser>
        }
    }
}