package com.inter.main;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("========================provider==============================");
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		ioc.start();
		System.in.read();

	}

}
