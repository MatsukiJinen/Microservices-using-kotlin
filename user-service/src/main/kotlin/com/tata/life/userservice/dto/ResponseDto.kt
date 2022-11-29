package com.tata.life.userservice.dto

import com.tata.life.userservice.entity.User

data class ResponseDto(
    val user: User,
    val department: Department
)