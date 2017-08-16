package com.codedak.lottery.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codedak.lottery.entity.Member;

/**
 * 
 * @author hunter
 *
 */
@FeignClient("lottery-member-service")   //该服务名称必须在服务中心注册
public interface MemberServiceFeignClient {
   @RequestMapping(method=RequestMethod.POST,value="/member/reg")	
   public void register(@RequestBody Member member);
   
   @RequestMapping(method=RequestMethod.POST,value="/member/login")	
   public void login(@RequestBody Member member);
}
