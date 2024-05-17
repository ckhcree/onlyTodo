package com.teamsparta.onlytodo.domain.user.dto

data class SignUpRequest (
    val email: String,
    val password: String,
    val nickname: String,
)