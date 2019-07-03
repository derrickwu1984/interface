package com.inter.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inter.dao.impl.InfoDaoImpl;
import com.inter.entity.InterfaceField;
import com.inter.service.InfoService;

public class InfoServiceImpl implements InfoService {
	@Autowired
	private InfoDaoImpl infodao;
	
	public List<InterfaceField> getInfoList() {
		System.out.println("========getInfoList()=============");
		return  this.infodao.getAllInfo();
	}

}
