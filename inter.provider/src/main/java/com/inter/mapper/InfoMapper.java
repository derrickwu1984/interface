package com.inter.mapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inter.entity.InterfaceField;

@Service
public interface InfoMapper {
	@Autowired
	public InterfaceField getAllInfo();
}
