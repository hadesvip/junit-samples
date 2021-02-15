package com.kevin.mockito.sample.test

import com.kevin.mockito.sample.domain.dto.UserDTO
import com.kevin.mockito.sample.service.UserService
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(MockitoJUnitRunner::class)
@SpringBootTest
class UserServiceTests {


    @Mock
    private val userservice: UserService? = null


    @Before
    fun init() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun getUserTest() {

//        org.mockito.Mockito.when(userservice?.getUser("001")).thenReturn(UserDTO(123,"zhangsan"))

        whenever(userservice?.getUser("001")).thenReturn(UserDTO(123, "zhangsan"))

        val user = userservice?.getUser("001")
        verify(user)

    }


}