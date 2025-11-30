package org.kotlin.kotlin_pjt.repository.member

import org.kotlin.kotlin_pjt.entity.member.Member
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository : JpaRepository<Member, Long> {
    fun existsByEmail(email: String): Boolean
    fun findByEmail(email: String): Member?
}