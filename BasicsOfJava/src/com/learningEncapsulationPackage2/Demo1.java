package com.learningEncapsulationPackage2;

import com.learningEncapsulation.AccessSpecifiersDemo;

public class Demo1 {
public static void main(String[] args) {
	AccessSpecifiersDemo d1=new AccessSpecifiersDemo();
	System.out.println(d1.b);
	Demo1 d2=new Demo1();
	System.out.println(d1.b);
}
}
