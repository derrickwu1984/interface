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

	@Test
	public void test() {
		for(InterfaceField field:info.getInfoList()) {
			System.out.println(field.getFunc_desc());
		}
		System.out.println("=========end========");
		
		
	}

}
