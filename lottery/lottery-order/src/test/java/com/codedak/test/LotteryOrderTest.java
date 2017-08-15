package com.codedak.test;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.codedak.lottery.order.App;
import com.codedak.lottery.service.ILotteryOrderService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT,classes=App.class)
public class LotteryOrderTest {

	@Autowired
    private ILotteryOrderService orderService;

    @Test
    public void testCreateOrder() throws Exception {
    	orderService.createOrder("test", 3000, "00002");
    }

    
}
