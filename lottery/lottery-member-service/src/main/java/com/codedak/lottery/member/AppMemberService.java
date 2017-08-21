package com.codedak.lottery.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.codedak.lottery.member.dao")
public class AppMemberService 
{
	
    public static void main( String[] args )
    {
    	SpringApplication.run(AppMemberService.class,args);
    }
}
