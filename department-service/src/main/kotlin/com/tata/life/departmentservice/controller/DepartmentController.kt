package com.tata.life.departmentservice.controller

import com.tata.life.departmentservice.entity.Department
import com.tata.life.departmentservice.service.DepartmentService
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/departments")
@Slf4j
class DepartmentController {
    
    @Autowired
    lateinit var service: DepartmentService

    @PostMapping("/")
    fun saveDepartment(@RequestBody department: Department): Department = service.save(department)
}