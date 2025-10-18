
package p1;


public class Account{

 private String customerName;
 private double accountNumber;
 private double accountBalance;


  public Account(String customerName,double accountNumber){
    this.customerName=customerName;
  	this.accountNumber=accountNumber;
  }

  public void SetCustomerName(String customerName){
  	this.customerName=customerName;
  }

   public void SetAccountNumber(double accountNumber){
  	this.accountNumber=accountNumber;
  }

  public double getAccountBalance(){
       return accountBalance;
  }

   public double getAccountNumber(){
       return accountNumber;
  }

     public String getCustomerName(){
       return customerName;
  }




  public void displayAccountDetails(){

  	System.out.println("Customer Name :"+getCustomerName);
  	System.out.println("Account Number :"+getAccountNumber);
    System.out.println("Account Balance  :"+getAccountBalance);
  }

  




}