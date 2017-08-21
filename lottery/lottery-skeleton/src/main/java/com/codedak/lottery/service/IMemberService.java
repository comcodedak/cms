package com.codedak.lottery.service;

import com.codedak.hessian.spring.annotation.HessianClient;
import com.codedak.lottery.entity.Member;

@HessianClient(name="lottery-member-service",linkUrl="lottery-member-service")
public interface IMemberService {
	   public void register(Member member);
	   
	   public Member login(Member member);
}
