package com.victor.member.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.victor.member.domain.MemberVO;
import com.victor.member.service.MemberService;
import com.victor.member.util.SecurityUtil;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@Autowired
	SecurityUtil util;

	@Autowired
	HttpSession session;
	
	@RequestMapping(value="/login")
	public ModelAndView login(){
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		
		return mav;
	}
	
	@RequestMapping(value="/home")
	public ModelAndView home(HttpServletResponse res) throws IOException{
		ModelAndView mav = new ModelAndView();
		MemberVO member = null;
		
		member = util.getCurrentMember();
		System.out.println("member : " + member);
		
		if(member == null){
			SecurityContextHolder.clearContext();
			res.sendRedirect("/login");
		}
		
		SecurityContextHolder.getContext().
		setAuthentication(new UsernamePasswordAuthenticationToken(member, null, member.getAuthorities()));
		
		mav.addObject("member", member);
		mav.setViewName("home");
		
		return mav;
	}
	
	@ExceptionHandler(Exception.class)
	private void exceptionHandler(HttpServletRequest req, Exception e) {
		System.err.println(e.getMessage());
	}
}
