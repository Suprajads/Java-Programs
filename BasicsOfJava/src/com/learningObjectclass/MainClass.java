package com.learningObjectclass;
//Requirement is create three mobiles of size 4.5 with yellow color, 5.5 in silver color and 6.0 in Gold color
public class MainClass {

	public static void main(String[] args) {
		System.out.println("Welcome to OurMobileCompany");
		
		//invoking static member using class name, we can do it even before creating object or anywhere
		//System.out.println(Mobile.oS); if u decalre OS as static,then invoke it using class name
		
		Mobile myMob1V1=new Mobile(4.5,"yellow");
		myMob1V1.call(98989899);
		myMob1V1.music("Shape of you");
		myMob1V1.callMusic(342432234, "Shape of YOu");
		
		System.out.println("The mobile color is" +myMob1V1.color);
		System.out.println("====================================");
		
	
		
		//second object creation
		Mobile myMob2V2=new Mobile(5.5,"Silver");
		//System.out.println(Mobile.oS);
		myMob2V2.music("abcd");
		System.out.println("The mobile color is" +myMob2V2.color);
		
		//Thrid object creation
		Mobile myMob3V3=new Mobile(6.0,"Gold");
		myMob3V3.call(998787878);
		
		
	}
}
//myMobV1 is the object variable