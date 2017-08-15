package com.codedak.lottery.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.codedak.lottery.entity.Member;


@Mapper
public interface IMemberDao {
	/**
	 * 注册会员
	 * @param member
	 */
   public void addMember(Member member);
    /**
     * 查询所有的会员
     * @param member
     */
   public List<Member> findAllMember();
}
