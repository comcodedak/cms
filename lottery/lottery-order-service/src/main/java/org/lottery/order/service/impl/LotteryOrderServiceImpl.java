package org.lottery.order.service.impl;

import java.util.UUID;

import org.lottery.order.dao.ILotteryOrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codedak.lottery.entity.LotteryOrder;
import com.codedak.lottery.service.ILotteryOrderService;

@Service("orderService")
public class LotteryOrderServiceImpl implements ILotteryOrderService{

	@Autowired
	private  ILotteryOrderDao orderDao;
	
	@Override
	public void createOrder(String orderName,long orderAmt,String lotteryBusiness) {
		LotteryOrder order=new LotteryOrder();
		order.setOrderBusiness(UUID.randomUUID().toString());
		order.setOrderName(orderName);
		order.setLotteryBusiness(lotteryBusiness);
		order.setOrderAmt(orderAmt);
		order.setOrderStatus("INIT");
		orderDao.add(order);
	}

}
