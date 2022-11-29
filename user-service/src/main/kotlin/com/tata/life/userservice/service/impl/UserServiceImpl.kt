package com.tata.life.userservice.service.impl

import com.tata.life.userservice.entity.User
import com.tata.life.userservice.repository.UserRepository
import com.tata.life.userservice.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl: UserService {

    @Autowired
    lateinit var repository: UserRepository

    override fun save(user: User): User = repository.save(user)

    override fun findById(id: Long): User = repository.findByUserId(id)

}