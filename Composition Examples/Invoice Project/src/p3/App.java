
package p3;

import p1.Customer;

import p2.Invoice;

class App{


	public static void main(String[] args) {

		Customer customer = new Customer(277,"Prathamesh",10);

		Invoice invoice = new Invoice(44,customer,5000);


		System.out.println(invoice);

		invoice.getAmountAfterdiscount();

		System.out.println(invoice);


		
	}
}