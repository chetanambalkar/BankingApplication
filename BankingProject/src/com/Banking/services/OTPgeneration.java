package com.Banking.services;

public class OTPgeneration {
	public int generateOTP() {
		int randompin=(int) (Math.random()*9000+1000);
		return randompin;
	}

}
