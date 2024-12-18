package com.devatri.dependencyinjection.domain.repository

import com.devatri.dependencyinjection.domain.model.User


interface UserRepository {
    suspend fun getUsers(): List<User>
    suspend fun getUserById(id: Int): User?
} 