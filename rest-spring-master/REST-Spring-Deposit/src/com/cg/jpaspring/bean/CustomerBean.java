package com.cg.jpaspring.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cust")
public class CustomerBean {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private String name;
	@Column
	private double balance;
	@Column
	private long phoneNumber;

	public CustomerBean() {
		super();
	}

	public CustomerBean(int id, String name, double balance, long phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "CustomerBean [id=" + id + ", name=" + name + ", balance="
				+ balance + ", phoneNumber=" + phoneNumber + "]";
	}

}
