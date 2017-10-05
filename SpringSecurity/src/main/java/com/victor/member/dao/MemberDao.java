package com.victor.member.dao;

import com.victor.member.domain.MemberVO;

public interface MemberDao {

	public MemberVO selectMember(String id);
}
