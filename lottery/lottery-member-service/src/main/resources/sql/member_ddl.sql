--会员信息表
CREATE TABLE IF NOT EXISTS MEMBER_INFO (
   MEMBER_NO           VARCHAR    NOT NULL UNIQUE,--会员NO号
   LOGIN_NAME                VARCHAR    NOT NULL UNIQUE,--用户名(登录名，唯一)
   PWD                 VARCHAR    NOT NULL,--密码（密文）
   NICE_NAME           VARCHAR   ,--昵称
   CREATE_TIME    TIMESTAMP    NOT NULL  default CURRENT_TIME()  ,  --记录创建时间
   UPDATE_TIME    TIMESTAMP ,  --记录更新时间
   MARK                VARCHAR  --备注
);
--账户表（T+1账户交易明细对账,分布式更新时金额检查字段UPDATE_TIME即可）
CREATE TABLE IF NOT EXISTS ACCOUNT (
   ID               INTEGER    NOT NULL   PRIMARY KEY AUTO_INCREMENT ,--自增id
   AMT                 VARCHAR    NOT NULL ,--账户金额(单位分)
   MEMBER_NO           VARCHAR    NOT NULL,--关联会员ID
   CREATE_TIME    TIMESTAMP    NOT NULL   default CURRENT_TIME()  ,  --记录创建时间
   UPDATE_TIME     TIMESTAMP    NOT NULL   default CURRENT_TIME(),  --记录更新时间
   MARK                VARCHAR  --备注
);
--账务交易明细表（订单状态确定才入库）
CREATE TABLE IF NOT EXISTS ACCOUT_FUND (
   ID           INTEGER    NOT NULL   PRIMARY KEY AUTO_INCREMENT ,--自增id
   TYPE            CHAR    NOT NULL ,--交易资金类型 0 代表支出 1代表存入
   AMT             TEXT    NOT NULL ,--交易金额(单位分)
   ORDER_TYPE      TEXT    NOT NULL ,--交易订单类型
   ORDER_BUSINESS  TEXT    NOT NULL ,--关联订单号
   CREATE_TIME TIMESTAMP   NOT NULL   default CURRENT_TIME() ,  --记录创建时间
   UPDATE_TIME TIMESTAMP            ,--记录更新时间
   MARK                VARCHAR  --备注
);
