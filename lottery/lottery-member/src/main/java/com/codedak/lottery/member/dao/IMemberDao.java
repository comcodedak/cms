package com.codedak.lottery.member.dao;

import java.util.List;

import com.codedak.lottery.entity.Member;

public interface IMemberDao {
    public void add(Member member);
    public List<Member> query(Member member);
}
