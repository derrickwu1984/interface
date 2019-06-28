package com.inter.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inter.entity.InterfaceField;
public interface InfoService {
	public List<InterfaceField> getInfoList();
}
