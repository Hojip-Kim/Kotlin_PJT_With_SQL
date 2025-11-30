package org.kotlin.kotlin_pjt.dto.member.response

import java.time.LocalDateTime

data class MemberSignupResponseDto(
    val id: Long,
    val email: String,
    val name: String,
    val createdAt: LocalDateTime
)