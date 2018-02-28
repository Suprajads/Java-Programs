package com.learningMethods;
//add two numbers and returns the result

public class AdditionUsingMethods 
{
	//the bleow method is retruning value
	public static int addTwoNumber(int x, int y)
	{
		int sum=x+y;
		return sum;
	}
	
//the below code is not returning any value. Area of circle
	static void areaOfTheCircle(double radius)
	{
		double pi=3.14;
		double area=pi*radius*radius;
		System.out.println("Area of the circle whose radius is: "+radius+" is:" +area);
		//return value is not mandatory because i dont want to return anyvalue
	}
	
//the bleow code is retruning value	
public static void main(String[] args) {
	int result=addTwoNumber(20,30);
	System.out.println("The sum is: "+result );
	int result2=addTwoNumber(30,result);
	System.out.println("The sum is: "+result2 );
	areaOfTheCircle(3.5);
	//int m=10+result;
	//if u want to perfom some task using the return value then
	//store the value that method is returning and do the task 
	
}
}
