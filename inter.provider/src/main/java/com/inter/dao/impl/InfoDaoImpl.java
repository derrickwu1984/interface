package com.inter.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inter.dao.InfoDao;
import com.inter.entity.InterfaceField;
import com.inter.service.InfoService;

@Service("InfoDao")
public class InfoDaoImpl extends BaseDaoImpl implements InfoDao {
	@Autowired
	private InterfaceField field;
	public List<InterfaceField> getAllInfo() {
		System.out.println("======getAllInfo=========");
		// TODO Auto-generated method stub
		return getSqlSession().selectList(getStatement("getAllInfo"));
	}

}
