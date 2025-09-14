package p3;

import p1.Customer;
import p2.Account;



class App{

	public static void main(String[] args) {

		Customer customer = new Customer(512,"Pratham",'M'); 

		Account account = new Account(320,customer,5678.33);

		System.out.println(account);

		account.withdraw(5000);

		System.out.println(account);

		account.deposite(500);

		System.out.println(account);
		
	}
}