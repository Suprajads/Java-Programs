package com.qspiders.learningLoops;

//Check if 1634 is Amstrong number or not

public class Amstrongnumber {

	public static void main(String[] args) {
		int i=15122;
		int temp=i;
		int count=0;
		int rem;
		int sum=0;
		
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		System.out.println("Total number of digits are :"+count);
		
		temp=i;
		
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+power(count,rem);
			temp=temp/10;
		}
		if(i==sum)
		{
			System.out.println(i+" is an armstrong number");
		}else
		{
			System.out.println(i+" is not an armstrong number");
		}
			
	}
	static int power(int digit,int rem2)
	{
		int p=1;
		for(int i=digit;i>0;i--)
		{
			p=p*rem2;
		}
		return p;
	}

}
