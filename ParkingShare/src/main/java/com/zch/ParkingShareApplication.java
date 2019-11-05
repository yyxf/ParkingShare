package com.zch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
@MapperScan("com.zch.mapper")   //扫描入口类
public class ParkingShareApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingShareApplication.class, args);
	}
}
//启动入后台之后，在hbuilder里面直接运行页面