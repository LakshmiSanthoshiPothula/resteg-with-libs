package com.cg.jpaspring.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.jpaspring.bean.CustomerBean;

@Repository("dao")
public class CustomerDaoImpl implements ICustomerDao {

	@PersistenceContext
	EntityManager em;

	@Override
	public void deposit(int id, double balance) {
		if(balance>0)
		{
			CustomerBean customerBean=new CustomerBean();
			customerBean=em.find(CustomerBean.class, id);
			customerBean.setBalance(customerBean.getBalance()+balance);
			em.merge(customerBean);
			em.flush();
		}
		
		/*List<CustomerBean> customerList = StaticDataBase.getCustomers();
		for (CustomerBean customerBean : customerList) {
			if (customerBean.getId() == id) {

				double amount=customerBean.getBalance()+balance;
				customerBean.setBalance(amount);
				System.out.println(customerBean);
				break;
			}
		}*/
		
	}
}
