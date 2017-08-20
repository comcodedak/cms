package com.codedak.lottery.member.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.codedak.hessian.spring.annotation.HessianService;
import com.codedak.lottery.entity.Member;
import com.codedak.lottery.member.dao.IMemberDao;
import com.codedak.lottery.service.IMemberService;

@HessianService(interfaces=IMemberService.class,name="memberService")
public class MemberServiceImpl implements IMemberService{
	@Autowired 
	private IMemberDao memberDao;
	
	@Override
	public void register(Member member) {
    	if(member==null) {
    		throw new RuntimeException("参数不正确3333");
    	}
    	member.setMemberNo(UUID.randomUUID().toString());
    	try {
    		memberDao.add(member);
    	}catch (Exception e) {
    		throw new RuntimeException("参数不正确4444");
		}
	}

	@Override
	public Member login(Member member) {
		if(member==null) {
			throw new RuntimeException("参数不正确111");
    	}
    	List<Member> ms=memberDao.query(member);
    	if(ms!=null&&ms.size()==1) {
    		return ms.get(0);
    	}
    	throw new RuntimeException("参数不正确2222");
	}

}
