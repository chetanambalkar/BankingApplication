package com.Banking.model;

public class Customer {
	
	private String bankAccountNo;
	private String password;
	
	public Customer(String bankAccountNo, String password) {
		this.bankAccountNo=bankAccountNo;
		this.password=password;
	}
	public void setbankAccountNo(String bankAccountNo) {
		this.bankAccountNo=bankAccountNo;
	}
	public void setpassword(String password) {
		this.password=password;
    }
	public String getbankAccountNo() {
		return this.bankAccountNo;
	}
	public String getpassword() {
		return this.password;
	}
	

}
