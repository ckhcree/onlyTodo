package com.teamsparta.onlytodo.domain.todoapplication.dto

import com.teamsparta.onlytodo.domain.todo.dto.TodoResponse
import com.teamsparta.onlytodo.domain.user.dto.UserResponse

data class TodoApplicationResponse (
    val id: Long,
    val todo: TodoResponse,
    val user: UserResponse,
    val status: String
)
