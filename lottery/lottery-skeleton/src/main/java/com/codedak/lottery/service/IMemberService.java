package com.codedak.lottery.service;

import com.codedak.lottery.entity.Member;

public interface IMemberService {
	   public void register(Member member);
	   
	   public Member login(Member member);
}
