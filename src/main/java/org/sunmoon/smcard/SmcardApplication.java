package org.sunmoon.smcard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.sunmoon.smcard"})
@MapperScan(basePackages = {"org.sunmoon.smcard"})
public class SmcardApplication {
	public static void main(String[] args) {
		SpringApplication.run(SmcardApplication.class, args);
	}
}
