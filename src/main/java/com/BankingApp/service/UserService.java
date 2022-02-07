package com.BankingApp.service;

import java.util.List;

import com.BankingApp.entities.CustomersData;



public interface UserService {
	
	void AddUser(CustomersData cust);
	List<CustomersData>getAllUser();
	
	

	
	
}
