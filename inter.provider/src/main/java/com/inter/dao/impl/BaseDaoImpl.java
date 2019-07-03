package com.inter.dao.impl;

import static org.junit.Assert.assertFalse;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository
public class BaseDaoImpl {
	@Resource
	private SqlSessionTemplate sqlSession;
	
	public SqlSession getSqlSession() {
		return sqlSession;
	}
	protected String getStatement(String sqlid) {
		String name = this.getClass().getName();
		StringBuffer sf = new StringBuffer().append(name).append(".").append(sqlid);
		return sf.toString();
		
	}

}
