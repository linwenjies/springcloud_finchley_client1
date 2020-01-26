package com.lwj.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 各个服务实例
 * @author linwenjie
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApp 
{
    public static void main( String[] args ){
        SpringApplication.run(EurekaClientApp.class, args);
    }
}
