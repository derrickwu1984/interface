package com.inter.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.inter.entity.InterfaceField;

@Service
public interface InfoMapper {
	public InterfaceField getAllInfo();
}
