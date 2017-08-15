package com.codedak.lottery.member.feginclient;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.codedak.lottery.service.IMemberService;

// name为服务名，对应spring.application.name。注意：此服务名必须已注册进Eureka服务中心
@FeignClient(name = "lottery-member-service")
public interface UserServiceFeign extends IMemberService{

}