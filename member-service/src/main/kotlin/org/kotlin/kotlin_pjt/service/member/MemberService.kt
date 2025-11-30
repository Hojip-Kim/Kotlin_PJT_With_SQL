package org.kotlin.kotlin_pjt.service.member

import org.kotlin.kotlin_pjt.dto.member.response.MemberSignupResponseDto
import org.kotlin.kotlin_pjt.vo.MemberSignupVo

interface MemberService {
    fun signup(memberSignupVo: MemberSignupVo): MemberSignupResponseDto
}