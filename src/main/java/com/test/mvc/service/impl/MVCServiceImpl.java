package com.test.mvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.mvc.dao.MVCDao;
import com.test.mvc.service.MVCService;

@Service
public class MVCServiceImpl implements MVCService{

	@Autowired
	private MVCDao mvcDao;
	
	public String sayHello() {
		System.out.println(mvcDao.sayHello());
		return "hi";
	}
}
