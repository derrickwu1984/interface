package com.inter.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.inter.entity.InterfaceField;
import com.inter.service.AllInfoService;
import com.inter.service.InfoService;
@Service
public class AllInfoServiceImpl implements AllInfoService {
	@Autowired
	private InfoService infoService;
	public void getAllInfo() {
		System.out.println("=================consumer start==========");
		// TODO Auto-generated method stub
				for(InterfaceField field:infoService.getInfoList()) {
					System.out.println(field.getFunc_desc());
				}
				System.out.println("=========consumer end========");
				
	}

}
