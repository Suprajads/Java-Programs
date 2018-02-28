package com.qspiders.basicOfJava.conditionalStatements;

public class Atm 
{
public static void main(String[] args)
{
	String custName="Supraja";
	long accNum=2387892;
	double acctBal=8567.90;
	int pin=5567;
	int enteredPin=5567;
	if(enteredPin==pin)
	{
		System.out.println("Your pin is correct");
		double amt=500;
		if(amt<=acctBal)
		{
			System.out.println("Withdrawing "+amt+ ' ' +custName);
		}else
		{
			System.out.println("Insufficient balance "+custName);
		}
	}else
	{
		System.out.println("please enter correct pin");
	}
	
}
}
