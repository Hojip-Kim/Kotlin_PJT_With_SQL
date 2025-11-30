package org.kotlin.kotlin_pjt.vo

import org.kotlin.kotlin_pjt.entity.member.Member

data class MemberSignupVo(
    val email: String,
    val password: String,
    val name: String
) {
    fun toEntity(): Member {
        return Member(
            email = this.email,
            password = this.password,
            name = this.name
        )
    }
}
