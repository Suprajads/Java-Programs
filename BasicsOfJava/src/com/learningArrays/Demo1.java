package com.learningArrays;

import java.util.Scanner;

public class Demo1 {
public static void main(String[] args) {
	/* Syntax
	 * arraytype[] arrayname=new arraytype[size];
	 */
	
	Scanner scn=new Scanner(System.in);
	System.out.println();
	
	System.out.println("Enter 5 values of Array");
	
	int[] arr1=new int[5];
	int temp=0,i=0,j=0;
	for(i=0;i<arr1.length;i++)
	{
		System.out.println("Enter the value for index: ");
		arr1[i]=scn.nextInt();
	}
		
	
	for(i=0;i<arr1.length;i++)
	{
		for(j=i;j<arr1.length;j++)
		{
			if(arr1[i]>arr1[j])
             {
	           temp=arr1[i];
	           arr1[i]=arr1[j];
	           arr1[j]=temp;
	           }
		}	
	}
	
	System.out.println("Array index in ascending order");
	for(i=0;i<arr1.length;i++)
	{
		System.out.println(""+arr1[i]);
	}
}
}
