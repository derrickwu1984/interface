package com.inter.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.inter.dao.impl.InfoDaoImpl;
import com.inter.entity.InterfaceField;
import com.inter.service.InfoService;
@Service("infoService")
public class InfoServiceImpl implements InfoService {
	@Resource
	private InfoDaoImpl infodao;
	
	public List<InterfaceField> getInfoList() {
		List list = infodao.getAllInfo();
		return  this.infodao.getAllInfo();
	}

}
