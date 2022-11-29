package com.tata.life.departmentservice.service

import com.tata.life.departmentservice.entity.Department

interface DepartmentService {
    fun save(department: Department): Department
}