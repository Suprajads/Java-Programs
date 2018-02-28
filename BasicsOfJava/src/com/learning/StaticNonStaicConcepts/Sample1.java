package com.learning.StaticNonStaicConcepts;

public class Sample1 {
//Global variables or CLASS LEVEL variables
	 int a=200;
	 static int b=300;

	 void test(int i)
	 {
		 //this is a local block, inside this whatever variables we declare, 
		 //only accessible within this block only.
		 //these are local vairables
		 System.out.println("Inside test()");
		 int x=10;
		 int y=i+x;
		 System.out.println(y);
		 System.out.println("a value is :"+a);
		 System.out.println("b value is :"+b);
		 System.out.println("==================================");
		 
	 }
	 static void disp(int j)
	 {
		 System.out.println("inside disp()");
		 int k=20+40;
		 System.out.println(k);
		 System.out.println("b value is :"+b);
//		 System.out.println(a);this will throw error, we cannot access nonstatic members inside a static type block because 
		 //there will not be any memory for a(non static mem) until we create an object 
System.out.println("==================================");
	 }
	 public static void main(String[] args)
	 {
		 System.out.println("=================================");
		 System.out.println("Inside main()");
		 System.out.println("b value is :"+b);
		 disp(20);//static member can be used directly without class name if we are in same class
		 Sample1 s1=new Sample1();
		 s1.test(80);
		 
		 System.out.println("======================================");
	 }
	 
}
