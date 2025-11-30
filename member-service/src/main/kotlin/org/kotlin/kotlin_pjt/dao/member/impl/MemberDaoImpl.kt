package org.kotlin.kotlin_pjt.dao.member.impl

import org.kotlin.kotlin_pjt.dao.member.MemberDao
import org.kotlin.kotlin_pjt.entity.member.Member
import org.kotlin.kotlin_pjt.repository.member.MemberRepository
import org.springframework.stereotype.Repository

@Repository
class MemberDaoImpl(
    private val memberRepository: MemberRepository
) : MemberDao {

    override fun existsByEmail(email: String): Boolean {
        return memberRepository.existsByEmail(email)
    }

    override fun save(member: Member): Member {
        return memberRepository.save(member)
    }

    override fun findByEmail(email: String): Member? {
        return memberRepository.findByEmail(email)
    }
}