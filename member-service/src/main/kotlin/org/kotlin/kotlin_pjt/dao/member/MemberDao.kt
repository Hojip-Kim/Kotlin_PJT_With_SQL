package org.kotlin.kotlin_pjt.dao.member

import org.kotlin.kotlin_pjt.entity.member.Member

interface MemberDao {
    fun existsByEmail(email: String): Boolean
    fun save(member: Member): Member
    fun findByEmail(email: String): Member?
}