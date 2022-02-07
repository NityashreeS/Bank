package com.BankingApp.serrviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BankingApp.Repository.UserRepo;
import com.BankingApp.entities.CustomersData;
import com.BankingApp.service.UserService;
import com.BankingApp.util.AutoGenrated;

@Service
public class ImplementingService implements UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private AutoGenrated autogenrated;

	@Override
	public void AddUser(CustomersData cust) {
		
		cust.setAccountNumber(autogenrated.Fun());
		
		// TODO Auto-generated method stub
		userRepo.save(cust);
	}

	@Override
	public List<CustomersData> getAllUser() {
		// TODO Auto-generated method stub
		return (List<CustomersData>) userRepo.findAll();
	}
	
	

}
