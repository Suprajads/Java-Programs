package com.BankAppwithAbstract;

public abstract class Account {
     int accNum;
     String custName;
     double accBal;
     
     //in all the accounts like Savings,current acc--the deposit implementation is same
     //so we can override this method
   abstract  void deposit(double amt) 
   
   abstract  void withdrawal(double amt)
    
     void checkBalance()
     {
    	 System.out.println("Checking Balance"+accBal);
    	
     }
}
