package com.inter.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.inter.entity.InterfaceField;

//@Service
@Repository
public interface InfoMapper {
	@Autowired
	public InterfaceField getAllInfo();
}
