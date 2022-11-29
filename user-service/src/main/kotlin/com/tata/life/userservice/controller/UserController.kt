package com.tata.life.userservice.controller

import com.tata.life.userservice.dto.ResponseDto
import com.tata.life.userservice.entity.User
import com.tata.life.userservice.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController {

    @Autowired
    lateinit var service: UserService

    @PostMapping("/")
    fun saveUser(@RequestBody user: User): User = service.save(user)

    @GetMapping("/{id}")
    fun getUserWithDepartment(@PathVariable id: Long): ResponseDto = service.getUserWithDepartment(id);
}