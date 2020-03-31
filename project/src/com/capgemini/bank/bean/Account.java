package com.capgemini.bank.bean;

public class Account {
	private Double actNo;
	private int balance;
	private int amount;
    private int chequeNum;
	private int ifsc;
	private String bankname;
	private String checkIssueDate;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getCheckIssueDate() {
		return checkIssueDate;
	}
	public void setCheckIssueDate(String checkIssueDate) {
		this.checkIssueDate = checkIssueDate;
	}
	private Double beneficiaryAcNO;
	public Double getBeneficiaryAcNO() {
		return beneficiaryAcNO;
	}
	public void setBeneficiaryAcNO(Double beneficiaryAcNO) {
		this.beneficiaryAcNO = beneficiaryAcNO;
	}
	public int getChequeNum() {
		return chequeNum;
	}
	public void setChequeNum(int chequeNum) {
		this.chequeNum = chequeNum;
	}
	public int getIfsc() {
		return ifsc;
	}
	public void setIfsc(int ifsc) {
		this.ifsc = ifsc;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	
	
	public Double getActNo() {
		return actNo;
	}
	public void setActNo(Double actNo) {
		this.actNo = actNo;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
