package com.kevin.mockito.sample.contoller

import com.kevin.mockito.sample.domain.vo.UserVO
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * 首页
 * @author wangyong
 */
@RestController
class HomeController : BaseController() {

    @RequestMapping(value = ["/"], produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun index() = "Welcome, My Buddy!"

}