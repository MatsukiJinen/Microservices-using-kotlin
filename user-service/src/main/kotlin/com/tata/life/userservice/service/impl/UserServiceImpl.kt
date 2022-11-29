package com.tata.life.userservice.service.impl

import com.tata.life.userservice.dto.Department
import com.tata.life.userservice.dto.ResponseDto
import com.tata.life.userservice.entity.User
import com.tata.life.userservice.repository.UserRepository
import com.tata.life.userservice.service.UserService
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class UserServiceImpl(
    private val repository: UserRepository,
    private val restTemplate: RestTemplate
): UserService {
    override fun save(user: User): User = repository.save(user)

    override fun getUserWithDepartment(id: Long): ResponseDto {
        val user: User = repository.findByUserId(id)

        val department: Department? = restTemplate
            .getForObject("http://DEPARTMENT-SERVICE/departments/" + user.departmentId, Department::class.java)

        return ResponseDto(user, department)
    }

}