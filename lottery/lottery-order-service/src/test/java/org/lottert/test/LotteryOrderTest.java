package org.lottert.test;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.lottery.order.dao.ILotteryOrderDao;
import org.lottery.order.service.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.codedak.lottery.entity.LotteryOrder;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT,classes=App.class)
public class LotteryOrderTest {

    @Autowired
    private ILotteryOrderDao orderDao;

    @Test
    public void testAdd() throws Exception {
    	LotteryOrder order=new LotteryOrder();
    	order.setOrderBusiness("0001");
    	order.setOrderName("跟单");
    	order.setOrderAmt(30000);
    	order.setOrderStatus("INIT");
    	order.setLotteryBusiness("aaaa0");
    	orderDao.add(order);
    }

    
}
