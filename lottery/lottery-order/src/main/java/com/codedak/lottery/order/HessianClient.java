package com.codedak.lottery.order;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

import com.codedak.lottery.service.ILotteryOrderService;

@Configuration
public class HessianClient {
	
	@Bean
    public HessianProxyFactoryBean helloClient() {
		RibbonHessianProxyFactoryBean factory = new RibbonHessianProxyFactoryBean();
        factory.setServiceUrl("http://data/lotteryOrderService");
        factory.setServiceInterface(ILotteryOrderService.class);
        return factory;
    }
}
