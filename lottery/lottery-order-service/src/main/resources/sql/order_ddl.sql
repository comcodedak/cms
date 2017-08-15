--彩票订单
CREATE TABLE IF NOT EXISTS ORDER_LOTTERY (
   ORDER_BUSINESS        VARCHAR   NOT NULL UNIQUE ,--订单号(唯一)
   ORDER_NAME            VARCHAR    ,--订单名称
   ORDER_AMT             VARCHAR   NOT NULL,--订单金额(单位分)
   ORDER_STATUS          VARCHAR   NOT NULL,--订单状态  INIT(已经创建)/PAY_PROCESS(支付中)/WAIT_PRISZE(待派奖)/PRISZE_OK(已派奖) 
   LOTTERY_AMT           VARCHAR   NOT NULL default 0,--彩票获奖金额(单位分)
   LOTTERY_BUSINESS      VARCHAR   NOT NULL ,--关联彩票开奖记录流水号
   CREATE_TIME      TIMESTAMP   NOT NULL  default CURRENT_TIME()  ,  --记录创建时间
   UPDATE_TIME      TIMESTAMP ,  --记录更新时间
   MARK                  TEXT  --备注
);

--时时彩彩票开奖记录
CREATE TABLE IF NOT EXISTS LOTTERY (
   LOTTERY_BUSINESS      VARCHAR   NOT NULL UNIQUE,--彩票开奖记录流水号(唯一期次)
   LOTTERY_DATA          VARCHAR   NOT NULL ,--彩票开奖数据 格式 1,2,3,4,5
   CREATE_TIME      TIMESTAMP   NOT NULL  default CURRENT_TIME()  ,  --记录创建时间
   UPDATE_TIME      TIMESTAMP ,  --记录更新时间
   MARK                  VARCHAR  --备注
);
