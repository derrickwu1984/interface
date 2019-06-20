package com.inter.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.inter.entity.InterfaceField;
@Repository
public interface InfoDao {
	public List<InterfaceField> getAllInfo();
}
