package com.capgemini.bank.pl;
import java.util.Scanner;

import com.capgemini.bank.bean.Account;
import com.capgemini.bank.bean.Customer;
import com.capgemini.bank.services.CustomerServiceImpl;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		Account account=new Account();
		
		CustomerServiceImpl csi=new CustomerServiceImpl();
	
		
		while(true) {
			System.out.println("1.credit amount using slip\n"
					+ "2.debit amount using slip \n"
					+ "3. credit amount using cheque\n"
					+ "4.dedit amount using cheque\n"
					+ "5.check balance");
			System.out.println("enter option");
			int opt=scr.nextInt();
			switch(opt) {
			case 1:
				  
				  System.out.println("enter account number..");
				  Double actNo=scr.nextDouble();
				  System.out.println("enter amount you want to deposite");
				  int amount=scr.nextInt();
				  
				  csi.creditUsingSlip(account.getBalance());
				  break;
			case 2:
				  System.out.println("enter account number..");
				  Double actNo2=scr.nextDouble();
				  System.out.println("enter amount to deposite");
				  Double amount2=scr.nextDouble();
				  
				  
				  
				  csi.debitUsingSlip(account.getBalance());
				  break;
			case 3:
				  System.out.println("enter account number..");
				  Double actNo3=scr.nextDouble();
				  System.out.println("enter beneficiary account number..");
				  Double beneficiaryAcNo=scr.nextDouble();
				  System.out.println("enter amount to deposite");
				  Double amount3=scr.nextDouble();
				  System.out.println("enter check number ");
				  int checkNum=scr.nextInt();
				  System.out.println("enter bank name");
				  String bankname=scr.next();
				  System.out.println("enter ifsc code");
				  int ifsc=scr.nextInt();
				  System.out.println("cheque issue date");
				  String chequeIssuedate=scr.next();
				  
				  csi.creditUsingCheque();
				  break;
				  
			case 4:
				  System.out.println("enter account number..");
				  Double actNo4=scr.nextDouble();
				  
				  System.out.println("enter amount to deposite");
				  Double amount4=scr.nextDouble();
				  System.out.println("enter check number ");
				  int checkNum2=scr.nextInt();
				  System.out.println("enter bank name");
				  String bankname2=scr.next();
				  System.out.println("enter ifsc code");
				  int ifsc2=scr.nextInt();
				  System.out.println("cheque issue date");
				  String chequeIssuedate2=scr.next();
				  
				  csi.debitUsingCheque();
				  
			
				default:
					System.out.println("Thanks for using");
				  
				  
				  scr.close();
				  
				  
				 
				
				  
			}

		}
	}
}

