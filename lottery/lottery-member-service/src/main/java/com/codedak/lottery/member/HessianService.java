package com.codedak.lottery.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;

import com.codedak.lottery.service.ILotteryOrderService;
import com.codedak.lottery.service.IMemberService;

@Configuration
public class HessianService {
	@Autowired
	private IMemberService memberService;
	//发布服务
    @Bean(name = "/memberService")
    public HessianServiceExporter accountService() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(memberService);
        exporter.setServiceInterface(IMemberService.class);
        return exporter;
    }
}
