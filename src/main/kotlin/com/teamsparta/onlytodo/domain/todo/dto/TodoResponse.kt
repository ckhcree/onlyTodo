package com.teamsparta.onlytodo.domain.todo.dto

data class TodoResponse(
    val id: Long,
    val title: String,
    val due: String?,
    val status: String,
)