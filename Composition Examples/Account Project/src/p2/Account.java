package p2;

import p1.Customer;



public class Account{

	public int accountId;
	public Customer customer;
    public double balance;

    public Account(int accountId,Customer customer,double balance){this.accountId=accountId;this.customer=customer;this.balance=balance;}

    public Account(int accountId,Customer customer){this.accountId=accountId;this.customer=customer;}

    public int getId(){return accountId;}
    public Customer getCustomer(){return customer;}

    public double getBalance(){return balance;}
    public void setBalance(double balance){this.balance=balance;}

    public void deposite(double amount){ 

       balance=amount+balance;
         System.out.println("Deposite "+amount+" rs "+" sucessfully ");

        }

    public void withdraw(double amount){

     if (amount<=balance) {
     	balance =balance-amount;
     System.out.println("Withdraw sucessfully ");}
     else 
     	System.out.println("You Dont have Enough Balance ");

}

    @Override
    public String toString(){
    	return customer.toString()+","+"Account Id :"+accountId+","+"Balance :"+balance;
    }


}