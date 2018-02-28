package com.BankApp;

public class Account {
     int accNum;
     String custName;
     double accBal;
     
     //in all the accounts like Savings,current acc--the deposit implementation is same
     //so we can override this method
     void deposit(double amt) 
     {
        	 System.out.println("deposting "+amt);
        	 accBal=accBal+amt;
     }
     void withdrawal(double amt)
     {
    	 System.out.println("Withdrawing "+amt);
    	 accBal=accBal-amt;
     }
     void checkBalance()
     {
    	 System.out.println("Checking Balance"+accBal);
    	
     }
}
