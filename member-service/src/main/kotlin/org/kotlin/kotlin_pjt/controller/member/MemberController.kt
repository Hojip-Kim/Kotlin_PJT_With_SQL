package org.kotlin.kotlin_pjt.controller.member

import org.kotlin.kotlin_pjt.dto.member.request.MemberSignupRequestDto
import org.kotlin.kotlin_pjt.dto.member.response.MemberSignupResponseDto
import org.kotlin.kotlin_pjt.service.member.MemberService
import org.kotlin.kotlin_pjt.vo.MemberSignupVo
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/members")
class MemberController(
    private val memberService: MemberService
) {

    @PostMapping("/signup")
    fun signup(@RequestBody requestDto: MemberSignupRequestDto): ResponseEntity<MemberSignupResponseDto> {
        val memberSignupVo : MemberSignupVo = requestDto.toVo()
        val response : MemberSignupResponseDto = memberService.signup(memberSignupVo)
        return ResponseEntity.status(HttpStatus.CREATED).body(response)
    }
}