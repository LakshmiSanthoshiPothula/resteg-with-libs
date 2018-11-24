package com.cg.jpaspring.staticdb;

import java.util.ArrayList;
import java.util.List;

import com.cg.jpaspring.bean.CustomerBean;

public class StaticDataBase {

	
	private static List<CustomerBean> list=new ArrayList<CustomerBean>();
	
	public static List<CustomerBean> getCustomers(){
		
		list.add(new CustomerBean(1,"sowjanya",2000.00,9032974524L));
		
		list.add(new CustomerBean(2,"sindhu",5000.00,8978974524L));
		
		return list;
		
	}
	
}
