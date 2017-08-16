package com.codedak.lottery.member.dao;

import java.util.List;


import com.codedak.lottery.entity.Member;

public interface IMemberDao {   
   /**
    * 注册会员
    * @param member
    */
   public void add(Member member);
   /**
    * 查询符合要求的会员列表
    * @param member
    * @return
    */
   public List<Member> query(Member member);
}
