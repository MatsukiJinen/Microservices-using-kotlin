package com.tata.life.userservice.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val userId: Long,
    val firstName: String,
    val lastName: String,
    val email: String,
    val departmentId: Long
)
