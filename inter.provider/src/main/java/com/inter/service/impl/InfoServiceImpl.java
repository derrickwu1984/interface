package com.inter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.inter.entity.InterfaceField;
import com.inter.mapper.InfoMapper;
import com.inter.service.InfoService;
@Service("infoServiceImpl")
@Repository(value="infoServiceImpl")
public class InfoServiceImpl implements InfoService {
	@Autowired
	private InfoMapper infoMapper;
	
	public InterfaceField getInfoList() {
		return this.infoMapper.getAllInfo();
	}

}
