package com.qspiders.basicOfJava.conditionalStatements;
//This is a switch program
//Author name:Supraja

/*this is my program
 * to print month
 * statment
 */

public class SwitchDemo {
	public static void main(String[] args) {
		int month=4;
		String monthName;
		switch(month)
		{
		case 1: 
			monthName="Jan";
			System.out.println(monthName);
			break;
		case 2:
			monthName="Feb";
			System.out.println(monthName);
			break; 
		case 3:
			monthName="March";
			System.out.println(monthName);
			break;
		case 4:
			monthName="Apr";
			System.out.println(monthName);
			break;
		case 5:
			monthName="May";
			System.out.println(monthName);
			break;	
		case 6:
			monthName="June";
			System.out.println(monthName);
			break;
		case 7:
			monthName="July";
			System.out.println(monthName);
			break;
		case 8:
			monthName="Aug";
			System.out.println(monthName);
			break;
		case 9:
			monthName="Sep";
			System.out.println(monthName);
			break;
		case 10:
			monthName="Oct";
			System.out.println(monthName);
			break;
		case 11:
			monthName="Nov";
			System.out.println(monthName);
			break;
		case 12:
			monthName="Dec";
			System.out.println(monthName);
			break;
		default:
			monthName="Invalid month";
			System.out.println(monthName);
			break;
			
		}
	}

}
