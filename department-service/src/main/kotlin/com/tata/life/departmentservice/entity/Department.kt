package com.tata.life.departmentservice.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Department(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val departmentId: Long,
    val departmentName: String,
    val departmentAddress: String,
    val departmentCode: String
)
