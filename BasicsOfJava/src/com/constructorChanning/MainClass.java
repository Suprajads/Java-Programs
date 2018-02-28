package com.constructorChanning;

public class MainClass {
public static void main(String[] args) {
	Sample3 s3=new Sample3(30,10);
	Sample2 s2=new Sample2();
	int c=s3.i;
	//s3 object can access all the datamembers of s1,s2,s3 and object class
	//s2 can access s1,s2 and object class
	//object class is super class of s1 so all the subclasses's object 
}
}
