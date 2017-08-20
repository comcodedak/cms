package com.codedak.lottery.service;

import com.codedak.hessian.spring.annotation.HessianClient;
import com.codedak.lottery.entity.Member;

@HessianClient(name="memberService",linkUrl="lottery-member-service")
public interface IMemberService {
	   public void register(Member member);
	   
	   public Member login(Member member);
}
