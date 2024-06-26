package ru.aps.performance.services

import ru.aps.performance.repos.UserRepository
import ru.aps.performance.models.User
import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Value
import java.util.Optional
import java.util.UUID

@Service
class UsersService(
    private val userRepository: UserRepository,
) {
    fun findAllUsersExceptMe(userId: UUID): List<User> {
        return userRepository.findAll().toList().filter { it.uid != userId }
    }

    fun findUserByName(name: String): Optional<User> {
        return userRepository.findUserByName(name)
    }

    fun purgeAllUsers() {
        userRepository.deleteAll()
    }
}