package com.capgemini.bank.services;

import com.capgemini.bank.bean.Account;

public class CustomerServiceImpl implements CustomerService{
	
    Account account=new Account();
	private int balance;

	
	@Override
	public void creditUsingSlip(int amount) {
		// TODO Auto-generated method stub
		
		if(amount<0) {
			System.out.println("invalid");
		}
			else
			this.balance=this.balance+amount;
			
		}
	


	@Override
	public void debitUsingSlip(int amount) {
		
		// TODO Auto-generated method stub
		if(balance>=amount) {
			this.balance=this.balance-amount;
			
		}
		else
			System.out.println("Invalid");
		
		}
		
		
	

	@Override
	public void creditUsingCheque() {
		// TODO Auto-generated method stub
		
		
	}

	//@Override
  public void debitUsingCheque() {
		// TODO Auto-generated method stub
		
		
      }

}
		