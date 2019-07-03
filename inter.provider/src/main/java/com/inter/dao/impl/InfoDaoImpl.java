package com.inter.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.inter.dao.InfoDao;
import com.inter.entity.InterfaceField;

@Repository
public class InfoDaoImpl extends BaseDaoImpl implements InfoDao {
	public List<InterfaceField> getAllInfo() {
		// TODO Auto-generated method stub
		return getSqlSession().selectList(getStatement("getAllInfo"));
	}

}
