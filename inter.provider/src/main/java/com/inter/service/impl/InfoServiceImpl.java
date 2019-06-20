package com.inter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inter.entity.InterfaceField;
import com.inter.mapper.InfoMapper;
import com.inter.service.InfoService;
@Service("InfoServiceImpl")
public class InfoServiceImpl implements InfoService {
	@Autowired
	private InfoMapper infoMapper;
	
	public InterfaceField getInfoList() {
		return this.infoMapper.getAllInfo();
	}

}
