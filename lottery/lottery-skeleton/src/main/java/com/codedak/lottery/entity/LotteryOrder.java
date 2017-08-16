package com.codedak.lottery.entity;

import java.io.Serializable;

public class LotteryOrder implements Serializable{
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String orderBusiness;//订单流水号
	  private String orderName;//订单名称
	  private long orderAmt;//订单金额(单位分)
	  private String orderStatus;//订单状态  INIT(已经创建)/PAY_PROCESS(支付中)/WAIT_PRISZE(待派奖)/PRISZE_OK(已派奖) 
	  private long lotteryAmt;//彩票获奖金额(单位分)
	  private String lotteryBusiness;//关联彩票开奖记录流水号
	  private String createTime;//记录创建时间
	  private String updateTime;//记录更新时间
	  private String mark;//备注
	public String getOrderBusiness() {
		return orderBusiness;
	}
	public void setOrderBusiness(String orderBusiness) {
		this.orderBusiness = orderBusiness;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public long getOrderAmt() {
		return orderAmt;
	}
	public void setOrderAmt(long orderAmt) {
		this.orderAmt = orderAmt;
	}
	public long getLotteryAmt() {
		return lotteryAmt;
	}
	public void setLotteryAmt(long lotteryAmt) {
		this.lotteryAmt = lotteryAmt;
	}
	public String getLotteryBusiness() {
		return lotteryBusiness;
	}
	public void setLotteryBusiness(String lotteryBusiness) {
		this.lotteryBusiness = lotteryBusiness;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	  
	  
}
