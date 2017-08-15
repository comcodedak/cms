package com.codedak.lottery.service;

public interface ILotteryOrderService {
	 /**
	  * 创建彩票订单
	  * @param orderAmt
	  * @param orderStatus
	  */
     public void createOrder(String orderName,long orderAmt,String lotteryBusiness);
}
