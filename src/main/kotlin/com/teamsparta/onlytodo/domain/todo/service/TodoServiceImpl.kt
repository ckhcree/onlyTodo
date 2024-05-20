package com.teamsparta.onlytodo.domain.todo.service


import com.teamsparta.onlytodo.domain.exception.ModelNotFoundException
import com.teamsparta.onlytodo.domain.todo.dto.CreateTodoRequest
import com.teamsparta.onlytodo.domain.todo.dto.TodoResponse
import com.teamsparta.onlytodo.domain.todo.dto.UpdateTodoRequest
import com.teamsparta.onlytodo.domain.todo.model.TodoEntity
import com.teamsparta.onlytodo.domain.todo.model.toResponse
import com.teamsparta.onlytodo.domain.todo.repository.TodoRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
class TodoServiceImpl(private val todoRepository: TodoRepository) : TodoService {

    override fun getAllTodoList(): ArrayList<TodoResponse> {
        return todoRepository.findAll().map{ it.toResponse()} // map부분 이해x
    }

    override fun getTodoById(todoId: Long): TodoResponse {
        val todo = todoRepository.findById(todoId)
            ?: throw ModelNotFoundException("Todo", "todoId")
        return todo.toResponse() // 찾은 todo를 toresponse 타입으로 변환하고싶음. 그런데 서비스에선 todoresponse임..
    }

    @Transactional
    override fun createTodo(todo: CreateTodoRequest): TodoResponse {

        return todoRepository.save(
            TodoEntity(
                title = todo.title,
                content = todo.content,
                name = todo.name,
            )).toResponse() // toresponse 타입 어디서 생성되었는지 모름
    }

    @Transactional
    override fun updateTodo(todoId: Long, request: UpdateTodoRequest): TodoResponse {
        // TODO
    }

    @Transactional
    override fun deleteTodo(todoId: Long) {
        val todo = todoRepository.findById(todoId)
            ?: throw ModelNotFoundException("Todo", "todoId")
        todoRepository.deleteTodo(todo) // todorepository에 있는 todo를 삭제
    }

}