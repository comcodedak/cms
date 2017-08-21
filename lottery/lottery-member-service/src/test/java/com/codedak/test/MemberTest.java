package com.codedak.test;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.codedak.lottery.entity.Member;
import com.codedak.lottery.member.AppMemberService;
import com.codedak.lottery.member.dao.IMemberDao;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT,classes=AppMemberService.class)
public class MemberTest {

	@Autowired
    private IMemberDao memberDao;

    @Test
    public void testQuery() throws Exception {
    	System.out.println(memberDao.query(new Member()));
    }

    
}
