package com.tata.life.departmentservice.service.impl

import com.tata.life.departmentservice.entity.Department
import com.tata.life.departmentservice.repository.DepartmentRepository
import com.tata.life.departmentservice.service.DepartmentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DepartmentServiceImpl: DepartmentService {

    @Autowired
    lateinit var repository: DepartmentRepository

    override fun save(department: Department): Department {
        return repository.save(department)
    }
}