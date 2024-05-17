package com.teamsparta.onlytodo.domain.courseapplication.model

import com.teamsparta.onlytodo.domain.todo.model.TodoEntity
import com.teamsparta.onlytodo.domain.todoapplication.model.TodoApplicationStatus
import com.teamsparta.onlytodo.domain.user.model.UserEntity
import jakarta.persistence.*

@Entity
@Table(name = "todo_application")
class TodoApplication(
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    var status: TodoApplicationStatus = TodoApplicationStatus.ACCEPTED,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}