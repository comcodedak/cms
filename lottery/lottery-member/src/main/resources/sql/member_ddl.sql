--用户信息表
CREATE TABLE IF NOT EXISTS MEMBER (
   ID        VARCHAR   NOT NULL UNIQUE ,--账户ID
   MAIL          VARCHAR   ,--邮箱
   MOBILE          VARCHAR  ,--手机号码
   PASSWORD             VARCHAR   NOT NULL,--密码
   NICE_NAME          VARCHAR   ,--昵称
   CREATE_TIME      TIMESTAMP   NOT NULL  default CURRENT_TIME()  ,  --记录创建时间
   UPDATE_TIME      TIMESTAMP ,  --记录更新时间
   MARK                  TEXT  --备注
);