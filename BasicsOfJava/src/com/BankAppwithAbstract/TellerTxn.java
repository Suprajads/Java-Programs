package com.BankAppwithAbstract;

public class TellerTxn {

	void depositTxn(Account acc1,double amt)
	{
		acc1.deposit(amt);
	}
	
	void withdrawalTxn(Account acc1,double amt)
	{
		acc1.withdrawal(amt);
	}
	
	void balanceEnquiry(Account acc1)
	{
		acc1.checkBalance();
	}
}
