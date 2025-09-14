
package p2;

import p1.Customer;

public class Invoice{

	public int id;

	public Customer customer;

	public double amount;



	public Invoice(int id,Customer customer,double amount){
		this.id=id; this.customer=customer; this.amount=amount;
	}

	public int getId(){return id;}

	public Customer getCustomer(){return customer;}

	public void setCustomer(Customer customer){this.customer=customer;}

	public double getAmount(){return amount;}

	public void setAmount(double amount){this.amount=amount;}

	public String getCustomerName(){return customer.getName();}

	public double getAmountAfterdiscount(){

		return amount=amount-(amount*customer.getDiscount()/100.0);
	}

	 @Override
    public String toString() {
        return "Invoice ID: " + id + ", Customer: " + customer + ", Amount :" +amount ;
    }


}