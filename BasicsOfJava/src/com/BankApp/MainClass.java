package com.BankApp;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("***********************************");
		System.out.println("Welcome to QspiderBank");
		AccountManager divya=new AccountManager();
		TellerTxn abhay=new TellerTxn();
		
		//Malathy wants to OPen the account,so Malathy need to contact Divya
		//AccountManager gives a form to be filled by customer
		//Once AcctManager clicks submit, that code will go to Server.
		//Server(like Main method) should have a code to fetch it.
		//then server invokes the method, and pass the fetched value
		//that method will return the results to Controller(Server)
		//Server will pass the response to HTML form page(View)
		//Model View COntroller
		
		Account malathyAccount=divya.openAccount("Malathy", 1234, 50000, 's');
		//now Malathy's account is opened. Now she can ask the Teller to check the balance
		
		abhay.balanceEnquiry(malathyAccount);
		
		//now she wants teller to deposit
		
		abhay.depositTxn(malathyAccount, 500);
		//now check balance
		abhay.balanceEnquiry(malathyAccount);
		System.out.println("*********");
		//now she wants teller to withdraw
		abhay.withdrawalTxn(malathyAccount, 1000);
		abhay.balanceEnquiry(malathyAccount);
	}
}
