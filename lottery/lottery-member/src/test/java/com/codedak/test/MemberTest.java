package com.codedak.test;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.codedak.lottery.entity.Member;
import com.codedak.lottery.member.AppMember;
import com.codedak.lottery.service.IMemberService;
import com.codedak.lottery.service.MemberServiceFeignClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT,classes=AppMember.class)
public class MemberTest {

	@Autowired
    private MemberServiceFeignClient client;
	
	@Autowired
    private IMemberService memberService;
	
    @Test
    public void testRegister() throws Exception {
    	Member member=new Member();
    	member.setLoginName("test112222");
    	member.setPwd("test22");
    	member.setNiceName("sadas");
    	client.register(member);
    }

    @Test
    public void testLogin() throws Exception {
    	Member member=new Member();
    	member.setLoginName("test");
    	member.setPwd("test");
    	memberService.login(member);
    	memberService.login(member);
    	memberService.login(member);
    }
}
