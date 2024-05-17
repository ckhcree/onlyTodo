package com.teamsparta.onlytodo.domain.todo.model

import jakarta.persistence.*


@Entity
@Table(name = "todoEntity")
class TodoEntity (
    @Column(name = "title")
    var title: String,

    @Column(name = "due")
    var due: String? = null,

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    var status: TodoStatus
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}