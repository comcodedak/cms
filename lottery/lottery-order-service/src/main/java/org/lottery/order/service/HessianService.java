package org.lottery.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;

import com.codedak.lottery.service.ILotteryOrderService;

@Configuration
public class HessianService {
	@Autowired
	private ILotteryOrderService orderService;
	//发布服务
    @Bean(name = "/lotteryOrderService")
    public HessianServiceExporter accountService() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(orderService);
        exporter.setServiceInterface(ILotteryOrderService.class);
        return exporter;
    }
}
