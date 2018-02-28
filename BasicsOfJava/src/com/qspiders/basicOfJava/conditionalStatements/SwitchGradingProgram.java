package com.qspiders.basicOfJava.conditionalStatements;

public class SwitchGradingProgram {
public static void main(String[] args) {
	char grade='A';
	switch(grade)
	{
	case 'A':
		System.out.println("The Student has scored above 80% and has Passed with distinction");
		break;
	case 'B':
		System.out.println("The Student has scored above 70% and has Passed");
		break; 
	case 'C':
		System.out.println("The Student has scored above 50% with a grade C");
		break;
	default:
		System.out.println("Invalid input");
		break;
}
}
}