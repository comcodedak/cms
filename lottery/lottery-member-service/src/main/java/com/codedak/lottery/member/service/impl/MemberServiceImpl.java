package com.codedak.lottery.member.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codedak.lottery.entity.Member;
import com.codedak.lottery.member.dao.IMemberDao;
import com.codedak.lottery.service.IMemberService;

@Service("memberService")
public class MemberServiceImpl implements IMemberService{

	@Autowired
	private IMemberDao memberDao;

	@Override
	public List<Member> findAllMember() {
		// TODO Auto-generated method stub
		return memberDao.findAllMember();
	}

	@Override
	public int regMember(Member member) {
		return 0;
	}


	

}
