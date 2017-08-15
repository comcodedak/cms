package com.codedak.lottery.member.controller;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codedak.lottery.entity.Member;
import com.codedak.lottery.service.IMemberService;
import com.netflix.client.ClientFactory;
import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.ZoneAwareLoadBalancer;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/member")     // 通过这里配置使下面的映射都在/member下，可去除
public class MemberController {


    @ApiOperation(value="获取用户列表", notes="")
    @RequestMapping(value={""}, method=RequestMethod.GET)
    public List<Member> findAllMember() {
//    	RibbonClient client = RibbonClient.builder().lbClientFactory(new LBClientFactory() {
//
//            @Override
//            public LBClient create(String clientName) {
//                IClientConfig config = ClientFactory.getNamedConfig(clientName);
//                ILoadBalancer lb = ClientFactory.getNamedLoadBalancer(clientName);
//                ZoneAwareLoadBalancer zb = (ZoneAwareLoadBalancer) lb;
//                zb.setRule(zoneAvoidanceRule());
//                return LBClient.create(lb, config);
//            }
//        }).build();
//
//    	IMemberService memberService=Feign.builder().decoder(JacksonDecoder())
//    			.errorDecoder(newServiceErrorDecoder(JacksonDecoder())).target(IMemberService.class,"http://localhost:8080");
       // return memberService.findAllMember();
    	return null;
    }

    @ApiOperation(value="这是测试接口", notes="")
    @RequestMapping(value={"/test"}, method=RequestMethod.GET)
    public String test() {
        return "这是测试接口";
    }

}