package com.inter.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inter.service.AllInfoService;
import com.inter.service.InfoService;

public class MainApplication {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		System.out.println("========================consumer==============================");
		ClassPathXmlApplicationContext applicationContext =new  ClassPathXmlApplicationContext("applicationContext.xml");
		AllInfoService InfoService =  applicationContext.getBean(AllInfoService.class);
		InfoService.getAllInfo();
		System.in.read();
	}
}
