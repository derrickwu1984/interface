package com.inter.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.inter.entity.InterfaceField;
public interface InfoDao {
	public List<InterfaceField> getAllInfo();
}
