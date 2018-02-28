package com.BankApp;

public class AccountManager {
	
	Account openAccount(String custName,int accNum,double initAmt,char type)
	{
		Account acc1=null;
		if(type=='s')//'s' means cust want saving acct's object
		{
			acc1=(Account)new SavingAccount(accNum,custName,initAmt);//Upcasting can be done implicikty.
			//(Account) is optional
		}
		else if(type=='l')
		{
			acc1=(Account)new LoanAccount(accNum,custName,initAmt);
		}//Loan
		return acc1;
	}

	void close(Account acc1)
	{
		acc1=null;
	}
}
