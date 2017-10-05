package com.victor.member.domain;

import org.springframework.security.core.GrantedAuthority;

public class AuthorityVO implements GrantedAuthority{

	private static final long serialVersionUID = 5327661028322678644L;
	
	private String auth;
	
	@Override
	public String getAuthority() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getAuth() {
		return auth;
	}
}
