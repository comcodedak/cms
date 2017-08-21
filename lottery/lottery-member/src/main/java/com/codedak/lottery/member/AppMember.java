package com.codedak.lottery.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import com.codedak.hessian.spring.annotation.EnableHessianAutoScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.codedak.lottery.service")
@EnableHessianAutoScan(basePackages="com.codedak.lottery.service")
public class AppMember 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(AppMember.class,args);
    }
}
