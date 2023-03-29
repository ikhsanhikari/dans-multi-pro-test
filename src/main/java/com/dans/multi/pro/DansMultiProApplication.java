package com.dans.multi.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.dans.multi.pro.config.AppProperties;

@EnableConfigurationProperties({ AppProperties.class })
@SpringBootApplication
@EnableFeignClients
public class DansMultiProApplication {

	public static void main(String[] args) {
		SpringApplication.run(DansMultiProApplication.class, args);
	}

}
