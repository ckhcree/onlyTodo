package com.teamsparta.onlytodo.domain.todo.dto

data class CreateTodoRequest(
    val title: String,
    val content: String,
    val due: String?,
)