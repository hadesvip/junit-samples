package com.kevin.mockito.sample.service.impl

import com.kevin.mockito.sample.domain.dto.UserDTO
import com.kevin.mockito.sample.service.UserService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {

    private val logger: Logger = LoggerFactory.getLogger(UserService::class.java)

    override fun getUser(userId: String): UserDTO {
        logger.info("获取用户信息,请求参数:{}", userId)
        logger.info("执行业务逻辑...")
        return UserDTO(userId.toLong(), "张三")
    }


}