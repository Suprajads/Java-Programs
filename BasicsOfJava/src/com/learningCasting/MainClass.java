package com.learningCasting;

public class MainClass {

	public static void main(String[] args) {
		Sample1 s1=(Sample1)new Sample2();
		
		//Sample2 s2=(Sample2) new Sample1();
		
		Sample2 s3=(Sample2)s1;
	
	}
}
