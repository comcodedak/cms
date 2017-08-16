package com.codedak.test;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.codedak.lottery.entity.Member;
import com.codedak.lottery.member.App;
import com.codedak.lottery.service.MemberServiceFeignClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT,classes=App.class)
public class MemberTest {

	@Autowired
    private MemberServiceFeignClient client;
	
	//@Autowired
    //private RestTemplate restTemplate;
	
    @Test
    public void testQuery() throws Exception {
    	Member member=new Member();
    	member.setLoginName("test222");
    	member.setPwd("test22");
    	member.setNiceName("sadas");
    	client.login(member);
    	//restTemplate.getForObject("http://lottery-member-service/member/login", Member.class);
    }

    
}
