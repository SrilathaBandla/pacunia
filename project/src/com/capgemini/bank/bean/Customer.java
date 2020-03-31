package com.capgemini.bank.bean;

public class Customer {
	private String name;
	private Double contact;
	private String aadhar;
	private String PAN;
	private String DOB;
	private String gender;
	private String adress;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getContact() {
		return contact;
	}
	public void setContact(Double contact) {
		this.contact = contact;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getPAN() {
		return PAN;
	}
	public void setPAN(String pAN) {
		PAN = pAN;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", contact=" + contact + ", aadhar=" + aadhar + ", PAN=" + PAN + ", DOB="
				+ DOB + ", gender=" + gender + ", adress=" + adress + "]";
	}

}
