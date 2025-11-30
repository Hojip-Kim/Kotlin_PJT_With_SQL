package org.kotlin.kotlin_pjt.service.member.impl

import org.kotlin.kotlin_pjt.dao.member.MemberDao
import org.kotlin.kotlin_pjt.dto.member.response.MemberSignupResponseDto
import org.kotlin.kotlin_pjt.entity.member.Member
import org.kotlin.kotlin_pjt.service.member.MemberService
import org.kotlin.kotlin_pjt.vo.MemberSignupVo
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MemberServiceImpl(
    private val memberDao: MemberDao
) : MemberService {

    @Transactional
    override fun signup(memberSignupVo: MemberSignupVo): MemberSignupResponseDto {
        // 이메일 중복 체크
        if (memberDao.existsByEmail(memberSignupVo.email)) {
            throw IllegalArgumentException("이미 존재하는 이메일입니다: ${memberSignupVo.email}")
        }

        val member : Member = memberSignupVo.toEntity()
        val savedMember : Member = memberDao.save(member)

        return MemberSignupResponseDto(
            id = savedMember.id,
            email = savedMember.email,
            name = savedMember.name,
            createdAt = savedMember.createdAt
        )
    }
}
