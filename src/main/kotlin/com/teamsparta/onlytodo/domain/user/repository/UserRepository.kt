package com.teamsparta.onlytodo.domain.user.repository

import com.teamsparta.onlytodo.domain.user.model.UserEntity
import org.springframework.boot.autoconfigure.security.SecurityProperties
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<SecurityProperties.User, Long> {
}
