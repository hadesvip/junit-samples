package com.kevin.mockito.sample.service

import com.kevin.mockito.sample.domain.dto.UserDTO

interface UserService {

    fun getUser(userId: String): UserDTO

}