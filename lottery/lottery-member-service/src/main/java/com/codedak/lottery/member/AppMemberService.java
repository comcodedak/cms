package com.codedak.lottery.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.codedak.hessian.spring.annotation.EnableHessianAutoScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.codedak.lottery.member.dao")
@EnableHessianAutoScan(basePackages="com.codedak.lottery.member.service.impl")
public class AppMemberService 
{
	
    public static void main( String[] args )
    {
    	SpringApplication.run(AppMemberService.class,args);
    }
}
