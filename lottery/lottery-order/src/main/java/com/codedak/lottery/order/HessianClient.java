package com.codedak.lottery.order;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

import com.codedak.lottery.service.ILotteryOrderService;

@Configuration
public class HessianClient {
	
	@Bean
    public HessianProxyFactoryBean helloClient() {
        HessianProxyFactoryBean factory = new HessianProxyFactoryBean();
        factory.setServiceUrl("http://localhost:8003/lotteryOrderService");
        factory.setServiceInterface(ILotteryOrderService.class);
        return factory;
    }
}
