package com.kevin.mockito.sample.contoller

import com.kevin.mockito.sample.domain.vo.UserVO
import com.kevin.mockito.sample.service.UserService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.annotation.Resource

@RequestMapping("/user")
@RestController
class UserController : BaseController() {

    val logger: Logger = LoggerFactory.getLogger(UserController::class.java);

    @Resource
    private var userService: UserService? = null


    @GetMapping("/getUser/{userId}")
    fun getUser(@PathVariable userId: String): UserVO {
        logger.info("获取用户信息请求,请求参数:{}", userId)
        val user = userService!!.getUser(userId)
        return UserVO(user.id, user.name)
    }


}