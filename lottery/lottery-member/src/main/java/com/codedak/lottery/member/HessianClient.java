package com.codedak.lottery.member;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

import com.codedak.lottery.service.IMemberService;

@Configuration
public class HessianClient {
	
	@Bean
    public HessianProxyFactoryBean helloClient() {
		RibbonHessianProxyFactoryBean factory = new RibbonHessianProxyFactoryBean();
        factory.setServiceUrl("http://lottery-member-service/memberService");
        factory.setServiceInterface(IMemberService.class);
        return factory;
    }
}
