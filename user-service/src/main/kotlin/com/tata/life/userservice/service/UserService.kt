package com.tata.life.userservice.service

import com.tata.life.userservice.entity.User

interface UserService {
    fun save(user: User): User
    fun findById(id: Long): User
}