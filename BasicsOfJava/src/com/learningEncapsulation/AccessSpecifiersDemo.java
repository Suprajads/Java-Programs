package com.learningEncapsulation;

public class AccessSpecifiersDemo {
private int a=20;
int b=40; //by default it is package
protected int c=30;
public int d=100;

public void test()
{
	System.out.println("In test() Accesspecifiers");
}
}
