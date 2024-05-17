package com.teamsparta.onlytodo.domain.todo.service


import com.teamsparta.onlytodo.domain.exception.ModelNotFoundException
import com.teamsparta.onlytodo.domain.todo.dto.CreateTodoRequest
import com.teamsparta.onlytodo.domain.todo.dto.TodoResponse
import com.teamsparta.onlytodo.domain.todo.dto.UpdateTodoRequest
import com.teamsparta.onlytodo.domain.todoapplication.dto.TodoApplicationResponse
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
class TodoServiceImpl: TodoService {

    override fun getAllTodoList(): ArrayList<TodoResponse> {
        TODO("Not yet implemented")
    }

    override fun getTodoById(todoId: Long): TodoResponse {
        TODO("Not yet implemented")
        throw ModelNotFoundException(modelName = "Todo", id = 1L)
    }

    @Transactional
    override fun createTodo(todo: CreateTodoRequest): TodoResponse {
        TODO("Not yet implemented")
    }

    @Transactional
    override fun updateTodo(todoId: Long, request: UpdateTodoRequest): TodoResponse {
        TODO("Not yet implemented")
    }

    override fun deleteCourse(courseId: Long) {
        TODO("Not yet implemented")
    }

    override fun getTodoApplication(todoId: Long, applicationId: Long): TodoApplicationResponse {
        TODO("Not yet implemented")
    }

    override fun getTodoApplicationList(todoId: Long): List<TodoApplicationResponse> {
        TODO("Not yet implemented")
    }

    @Transactional
    fun deleteTodo(courseId: Long) {
        TODO("Not yet implemented")
    }

    fun getTodoapplication(todoId: Long, applicationId: Long): TodoApplicationResponse {
        TODO("Not yet implemented")
    }

    fun getTodoapplicationList(todoId: Long): List<TodoApplicationResponse> {
        TODO("Not yet implemented")
    }

}