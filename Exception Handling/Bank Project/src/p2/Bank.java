package p2;

import p1.Account;

public class Bank{

private double bankID;

private String bankName;

private String bankLocation;

public Account account;

 public Bank(double bankID,String bankName,String bankLocation){
 	this.bankID=bankID; this.bankName=bankName; this.bankLocation;
 }


public void setBankID(double bankID){
	this.bankID=bankID;
}

public void setBankName(String bankName){
	this,bankName=bankName;
}

public void setBankLocation(String bankLocation){
	this,bankLocation=bankLocation;
}

public double getBankID(){return bankID;}
public String getBankName(){return bankName;}
public String getBankLocation(){return bankLocation;}




public void displayAccountDetails(){

	account.displayAccountDetails();

	System.out.println("BankID :"+getBankID);
	System.out.println("Bank Name :"+getBankName);
	System.out.println("Bank Location :"+getBankLocation);
}




}


