package com.teamsparta.onlytodo.domain.todo.service

import com.teamsparta.onlytodo.domain.todo.dto.CreateTodoRequest
import com.teamsparta.onlytodo.domain.todo.dto.TodoResponse
import com.teamsparta.onlytodo.domain.todo.dto.UpdateTodoRequest

interface TodoService {
    fun getAllTodoList(): ArrayList<TodoResponse>

    fun getTodoById(todoId: Long): TodoResponse

    fun createTodo(todo: CreateTodoRequest): TodoResponse

    fun updateTodo(todoId: Long, request: UpdateTodoRequest): TodoResponse

    fun deleteTodo(todoId: Long)

}