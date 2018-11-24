package com.cg.jpaspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.jpaspring.dao.ICustomerDao;

@Service("service")
@Transactional
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	ICustomerDao dao;

	@Override
	public void deposit(int id, double balance) {
		
		
		dao.deposit(id,balance);
	}
	

}
