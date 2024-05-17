package com.teamsparta.onlytodo.domain.user.model

import jakarta.persistence.*

@Entity
@Table(name = "app_user")
class UserEntity (
    @Column(name = "email")
    val email: String,

    @Column(name = "password")
    val password : String,

    @Embedded
    var profile: Profile
)
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
}