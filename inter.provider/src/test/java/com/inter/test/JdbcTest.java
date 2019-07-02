package com.inter.test;

import java.awt.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inter.entity.InterfaceField;
import com.inter.service.impl.InfoServiceImpl;
public class JdbcTest {
	
	private InfoServiceImpl info;
	private InterfaceField interField;
	@Before
	public void getBefore() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		info = applicationContext.getBean(InfoServiceImpl.class);
	}
	// TODO Auto-generated method stub

	@Test
	public void test() {
		int i=0;
		for(InterfaceField field:info.getInfoList()) {
			i++;
		}
		System.out.println("i="+i);
		
		
	}

}
