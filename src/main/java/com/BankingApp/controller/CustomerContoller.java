package com.BankingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BankingApp.entities.CustomersData;
import com.BankingApp.service.UserService;

@RestController
public class CustomerContoller {
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/Hello")
	public void userData(@RequestBody CustomersData cust)
	
	{
		System.out.println("***********************");
		userservice.AddUser(cust);
	}
	
	
	
	@PostMapping("/Hello1")
	public String userData1(@RequestBody CustomersData cust1)
	
	{
		System.out.println("***********************");
		return "Helllooooooo";
		//userservice.AddUser(cust);
	}
	
	
	
	@GetMapping("/FetchData")
	public List<CustomersData> getAllUser()
	{
		return userservice.getAllUser();
	}
	
	
	
	

}
