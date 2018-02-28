package com.learningHasARelationship;

public class Battery {

	int capacity=1400;
	int remainingbattery=14;
	public void charging()
	{
		System.out.println("Charging...");
		for(int i=remainingbattery;i<=100;i++)
		{
			System.out.println("Remaining battery is :"+remainingbattery);
			remainingbattery++;
			//try {
				//Thread.sleep(2000);
			//}
			
		}
		
	}
}
