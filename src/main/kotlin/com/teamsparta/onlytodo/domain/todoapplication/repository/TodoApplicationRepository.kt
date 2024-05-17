package com.teamsparta.onlytodo.domain.todoapplication.repository

import com.teamsparta.onlytodo.domain.courseapplication.model.TodoApplication
import org.springframework.data.jpa.repository.JpaRepository

interface TodoApplicationRepository: JpaRepository<TodoApplication, Long> {
}