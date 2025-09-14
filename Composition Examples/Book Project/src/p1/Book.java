package p1;

import p2.Author;

public class Book{


	public String name;
	 public double price;
	public int quantity;

	public Author author;

	public Book(String name,double price,int quantity,Author author){
    this.name=name; this.price=price; this.quantity=quantity; this.author=author;}

   public String getName(){return name;} 
   public String getAuthor(){return author.name;}
  public  double getPrice(){return price;}

   public void setPrice(double price){this.price=price;}

   public int getQuantity(){return quantity;}
   public void setQuantity(int quantity){this.quantity=quantity;}

   public void setAuthor(Author author){this.author=author;}


     @Override
public String toString() {
    return "Book Name: " + name +
           ", Author: " + author.getName() +
           " (" + author.getGender() + ")" +
           ", Email: " + author.getEmail() +
           ", Price: " + price +
           ", Quantity: " + quantity;
}


}