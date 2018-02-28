package com.learningMethods;

//Assignment
//Area of Triangle using Methods

public class AreaofTriangleUsingMethods 
{

		public static int areaOfTriangle(int height, int breadth)
		{
			int cal=height*breadth;
			int aot=cal/2;
			return aot;
		}
		
	public static int simpleInterest(int p,int n,int r)
	{
		int ans=p*n*r;
		int simpleInte=ans/100;
		return simpleInte;
	}
	public static void main(String[] args) 
	{
		int result=areaOfTriangle(2, 4);
		System.out.println("The area of Triangle is: "+result );
		
		int simpleInterest=simpleInterest(100, 5,3);
		System.out.println("The Simple interest is: "+simpleInterest);
	}
	}


