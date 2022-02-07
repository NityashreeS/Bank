package com.BankingApp.util;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class AutoGenrated {
	public long Fun()
	{
		Random r1 = new Random();
		long l1 = (long)(1000000000 + r1.nextFloat()*900000000);
		return l1;
		
	}

}


