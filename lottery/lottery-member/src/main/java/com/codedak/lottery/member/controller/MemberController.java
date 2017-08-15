package com.codedak.lottery.member.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codedak.lottery.entity.Member;
import com.codedak.lottery.exception.GlobalException;
import com.codedak.lottery.member.dao.IMemberDao;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/member")     // 通过这里配置使下面的映射都在/member下，可去除
public class MemberController {

	@Autowired 
	private IMemberDao memberDao;

    @ApiOperation(value="获取用户列表", notes="")
    @RequestMapping(value={""}, method=RequestMethod.GET)
    public List<Member> findAllMember() {
    	return memberDao.query(new Member());
    }

    @ApiOperation(value="账户登录", notes="输入手机号码或邮箱登录")
    @RequestMapping(value={"/login"}, method=RequestMethod.POST)
    public Member memberLogin(@RequestBody Member member) throws GlobalException {
    	if(member==null) {
    		throw new GlobalException("90000", "参数不正确");
    	}
    	memberDao.query(member);
    	return null;
    }
    
    @ApiOperation(value="账户注册", notes="")
    @RequestMapping(value={"/reg"}, method=RequestMethod.POST)
    public void memberReg(@RequestBody Member member) throws GlobalException {
    	if(member==null) {
    		throw new GlobalException("90000", "参数不正确");
    	}
    	member.setMemberID(UUID.randomUUID().toString());
    	memberDao.add(member);
    }
    
    @ApiOperation(value="这是测试接口", notes="这是测试接口")
    @RequestMapping(value={"/test"}, method=RequestMethod.GET)
    public String test() {
        return "这是测试接口";
    }

}