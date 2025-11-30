package org.kotlin.kotlin_pjt.dto.member.request

import org.kotlin.kotlin_pjt.vo.MemberSignupVo

data class MemberSignupRequestDto(
    val email: String,
    val password: String,
    val name: String
) {
    fun toVo(): MemberSignupVo {
        return MemberSignupVo(
            email = this.email,
            password = this.password,
            name = this.name
        )
    }
}