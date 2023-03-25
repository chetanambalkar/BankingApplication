package com.Banking.main;
import java.util.Scanner;

import com.Banking.model.Customer;
import com.Banking.services.Operations;

public class Mainapp {
	public static void main(String args[]) {
		int code;
		Operations banking=new Operations();
		Customer c1 = new Customer("1234567","pwd123");
		//Customer c2 = new Customer("987654","pwd321");
		Scanner sc=new Scanner(System.in);
		System.out.println("----Welcome to login page----");
	    System.out.println("Enter the account No");
	    String accountNo=sc.nextLine();
	    System.out.println("Enter the password");
	    String password=sc.nextLine();
	    
	    if(accountNo.equals(c1.getbankAccountNo()) && password.equals(c1.getpassword())) {
	       System.out.print("========Welcome to Indian Banking=========");
	    	
	    do {
	    	System.out.println();
	    	System.out.println("--------------------------");
	    	System.out.println("1.Deposit\n 2.Withdraw\n 3.Transfer\n 0.logout");
	    	System.out.println("--------------------------");
            code=sc.nextInt();
            
            switch(code) {
            case 1:
            	System.out.println("Enter the amount to deposit");
            	int amount=sc.nextInt();
            	banking.deposite(amount);
            	break;
            case 2:
            	System.out.println("Enter the amount to Withdrawl");
            	amount=sc.nextInt();
            	banking.withdraw(amount);
         	    break;
            case 3:System.out.println("Enter the amount to Transfer");
        	    amount=sc.nextInt();
        	    banking.transfer(amount);
         	    break;
            case 0:
            	System.out.println("Logging out from system");
         	    break;   
            default:System.out.println("Enter valid option"); 
            }
	      }
	    while(code!=0);
	        System.out.println("Exit from the app");
	        sc.close();
	    }
	    else {
	    	System.out.println("*****Invalid credential******");
	    }
	}

	

}
