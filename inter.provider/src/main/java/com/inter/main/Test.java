package com.inter.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Object user= context.getBean("sqlSession");
		String[] str=context.getBeanDefinitionNames();
		for (String string : str) {
		System.out.println("..."+string);
		}
		System.out.println("----sqlSession"+user);

		}

}
