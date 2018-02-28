package com.BankApp;

public class LoanAccount extends Account {
	LoanAccount(int accNum,String custName,double accBal)
	{
		this.accNum=accNum;
		this.custName=custName;
		this.accBal=accBal;
	}
	
	void deposit(double amt) 
    {
       	 System.out.println("deposting "+amt);
       	 accBal=accBal-amt;
    }
    void withdrawal(double amt)
    {
   	 System.out.println("Withdrawing "+amt);
   	 accBal=accBal+amt;
    }

}
