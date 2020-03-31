package com.capgemini.bank.services;

import com.capgemini.bank.bean.Account;

public interface CustomerService {
	void creditUsingSlip(int amount);
	void debitUsingSlip(int amount);
    void creditUsingCheque();
	void debitUsingCheque();
	
	
	
}