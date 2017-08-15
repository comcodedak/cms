package com.codedak.lottery.service;

import java.util.List;

import com.codedak.lottery.entity.Member;


public interface IMemberService {
	/**
	 * 获取所以的会员信息
	 * @param member
	 * @return
	 */
	public List<Member> findAllMember();
	/**
	 * 注册会员
	 * @param member
	 * @return
	 */
	public int regMember(Member member);
	
}
