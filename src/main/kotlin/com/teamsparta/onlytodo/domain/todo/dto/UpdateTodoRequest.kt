package com.teamsparta.onlytodo.domain.todo.dto

data class UpdateTodoRequest(
    val title: String,
    val content: String,
    val status: Boolean
)