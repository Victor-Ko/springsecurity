package com.victor.member.dao;

import java.util.List;

import com.victor.member.domain.AuthorityVO;

public interface AuthorityDao {

	public List<AuthorityVO> selectAuth(String id);
	
}
