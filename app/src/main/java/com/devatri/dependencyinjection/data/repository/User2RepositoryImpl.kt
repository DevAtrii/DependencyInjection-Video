package com.devatri.dependencyinjection.data.repository

import com.devatri.dependencyinjection.domain.model.User
import com.devatri.dependencyinjection.domain.repository.UserRepository
import kotlinx.coroutines.delay

class User2RepositoryImpl : UserRepository {
    // Simulating a data source
    private val users = listOf(
        User(1, "Athar Gul", "atrii@example.com"),
        User(2, "Ijaz", "ijaz@example.com"),
        User(3, "Rizwan", "rizudev@example.com")
    )

    override suspend fun getUsers(): List<User> {
        // Simulate network delay
        delay(1000)
        return users
    }

    override suspend fun getUserById(id: Int): User? {
        delay(500)
        return users.find { it.id == id }
    }
} 