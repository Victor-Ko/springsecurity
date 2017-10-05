package com.victor.member.service;

import java.util.List;

import com.victor.member.domain.AuthorityVO;

public interface AuthorityService {

	public List<AuthorityVO> selectAuth(String id);
}
