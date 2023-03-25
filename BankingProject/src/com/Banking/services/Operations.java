package com.Banking.services;
import java.util.Scanner;

public class Operations {

	int bankBalance=10000;
	Scanner sc=new Scanner(System.in);
	
	public void deposite(int amount) {
		if (amount>0) {
		System.out.println("Before deposit bank balance is"+bankBalance);
		bankBalance=bankBalance+amount;
		System.out.println("Account updated with deposit amount"+amount);
		System.out.println("Ater deposit bank balance is"+bankBalance);
	    }
		else {
			System.out.println("Invalid amount entered");
		}
	}
	public void withdraw(int amount) {
		if (bankBalance>amount) {
		System.out.println("Before withdraw bank balance is"+bankBalance);
		bankBalance=bankBalance-amount;
		System.out.println("Account updated with withdraw amount"+amount);
		System.out.println("After withdraw bank balance is"+bankBalance);
		}
		else {
			System.out.println("Insufficient funds");
		}
	}
	public void transfer(int amount) {
		if (bankBalance>amount) {
		System.out.println("Enter the OTP for fund transfer");
		int otpGenerated=otpGenerated.generateOTP();
		System.out.println("Send OTP to registered mobile no"+otpGenerated);
		System.out.println("Enter the OTP");
		int otp=sc.nextInt();
		
		if(otp==otpGenerated) {
			System.out.println("OTP verified sucessfully");
			System.out.println("Before Transfer bank balance is"+bankBalance);
			bankBalance=bankBalance-amount;
			System.out.println("Account updated with transfer amount"+amount);
			System.out.println("After transfer bank balance is"+bankBalance);
			}
		else {
			System.out.println("Wrong OTP entered");
		}
		}
		else {
			System.out.println("Insufficient funds");
		}
		
	}
}
