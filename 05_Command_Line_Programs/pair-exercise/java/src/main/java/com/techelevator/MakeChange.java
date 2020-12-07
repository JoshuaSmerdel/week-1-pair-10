package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill,
 and the amount tendered. It should then display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		//request bill amount
		System.out.print("Please Enter Bill Amount: ");
		String billAmount = scanner.nextLine();
		
		//request amount tendered
		System.out.print("Please Enter Amount Tendered: ");
		String tenderAmount = scanner.nextLine();
		
		//as if would like to cleave a tip
		System.out.print("Enter Tip Amount (0 = No)");
		String tipAmount = scanner.nextLine();
		
		//convert string to double
		double bill = Double.parseDouble(billAmount);
		double tender = Double.parseDouble(tenderAmount);
		double tip = Double.parseDouble(tipAmount);
		
		////////////////////////////////////////////////////
		
		double change = tender - (bill + tip);
		
		if (tip > 0)
		{
			System.out.println("Thank you for the genorous tip!");
		}
			 
		System.out.print("The Change required is $" + change);

	}
	
}
