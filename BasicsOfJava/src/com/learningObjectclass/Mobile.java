package com.learningObjectclass;

public class Mobile {

	// declare states of object
	double size = 4.5;
	String color = "Black";
	String oS = "ios"; // if u want,all apple products with IOS os,put it Static

	// declare constructor
	Mobile(double size, String color) {
		this.size = size;
		this.color = color;
	}

	// COnstructor overloading decalring more than one constructor
	Mobile(String color, String oS) {
		this.color = color;
		this.oS = oS;
	}
	
	Mobile(String color, String oS,double size) {
		this.color = color;
		this.oS = oS;
		this.size = size;
	}

	Mobile(double size) {
		this.size = size;
	}

	Mobile(String color) {
		this(5.0,"Windows");//if im chaning only color then my OS should be"Windows" and size should be 5.0
		//use this() statement in above scenarios 
		this.color = color;
	}
	// declare method
	void call(long number) {
		System.out.println("Calling " + number + ".....");
	}

	void music(String song) {
		System.out.println("Playing " + song + "......");
	}

	void callMusic(long number, String song) {
		System.out.println("Calling " + number + " Playing " + song + "......");
	}

}
// refer Mainclass for Object creation