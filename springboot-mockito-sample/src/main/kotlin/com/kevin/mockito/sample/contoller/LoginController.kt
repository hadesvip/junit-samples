package com.kevin.mockito.sample.contoller

import com.kevin.mockito.sample.domain.vo.ResultVO
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * 登录
 * @author wangyong
 */
@RestController
@RequestMapping("/user")
class LoginController : BaseController() {

    val logger: Logger = LoggerFactory.getLogger(LoginController::class.java)


    @PostMapping("/login")
    fun login(): ResultVO<Integer> {
        val rt: ResultVO<Integer> = ResultVO();




        return rt
    }


}