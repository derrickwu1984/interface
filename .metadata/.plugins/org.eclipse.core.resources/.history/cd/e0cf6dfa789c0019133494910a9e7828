package com.inter.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public class BaseDaoImpl {
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	public SqlSession getSqlSession() {
		return sessionTemplate;
	}
	protected String getStatement(String sqlid) {
		String name = this.getClass().getName();
		StringBuffer sf = new StringBuffer().append(name).append(".").append(sqlid);
		return sf.toString();
		
	}

}
