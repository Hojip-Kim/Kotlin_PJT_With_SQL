package org.kotlin.kotlin_pjt.entity.member

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Index
import jakarta.persistence.Table
import org.kotlin.kotlin_pjt.entity.common.BaseTimeEntity

@Entity
@Table(name = "member", indexes = [
    Index(name = "idx_member_email", columnList = "email")
    ]
)
class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    val id: Long,

    @Column(name = "email", nullable = false, unique = true, length = 100)
    var email: String,

    @Column(name = "password", nullable = false, length = 255)
    var password: String,

    @Column(name = "name", nullable = false, length = 50)
    var name: String

) : BaseTimeEntity()