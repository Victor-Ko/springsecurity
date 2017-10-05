package com.victor.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victor.member.dao.AuthorityDao;
import com.victor.member.domain.AuthorityVO;

@Service
public class AuthorityServiceImpl implements AuthorityService{

	@Autowired
	AuthorityDao authorityDao;
	
	@Override
	public List<AuthorityVO> selectAuth(String id) {
		return authorityDao.selectAuth(id);
	}

}
