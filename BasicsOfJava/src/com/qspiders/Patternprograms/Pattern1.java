package com.qspiders.Patternprograms;

public class Pattern1 {
/* patter program
 *                 *
 *               * * *
 *             * * * * *
 *           * * * * * * * 
 */
	
	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int k=3;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++)
			{
				System.out.print("*");
			}  
			System.out.println();
		}
	}
}
	
