package com.te.springmvccrudoperation1.dao;

import org.springframework.stereotype.Repository;

import com.te.springmvccrudoperation1.beans.EmployeeBean;

import antlr.collections.List;


public interface EmployeeDao {

	public EmployeeBean authenticate(int id,String pwd);
	
	public EmployeeBean getEmployee(int id);
	
	public boolean deleteEmployee(int id);
	
	public java.util.List<EmployeeBean> getAllData();
}
