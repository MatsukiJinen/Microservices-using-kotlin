package com.tata.life.departmentservice.repository

import com.tata.life.departmentservice.entity.Department
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DepartmentRepository: JpaRepository<Department, Long> {
    fun findByDepartmentId(id: Long): Department
}