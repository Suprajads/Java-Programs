package com.learningMethodOverloading;

public class Maill {
	int compose(String to)
	{
		System.out.println("Msg Has been sent");
		return 10;
	}
	void compose(String to, String sub)
	{
		System.out.println("Msg Has been sent");
		
	}
	void compose(String to, String sub, String body)
	{
		System.out.println("Msg Has been sent");
	}
}
