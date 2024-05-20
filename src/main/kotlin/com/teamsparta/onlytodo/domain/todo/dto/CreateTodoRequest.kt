package com.teamsparta.onlytodo.domain.todo.dto

data class CreateTodoRequest(
    val name: String,
    val title: String,
    val content: String,
)