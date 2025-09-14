package p3;

import p1.Book;

import p2.Author;

class App{

	public static void main(String[] args) {
		
		Author a1=new Author("Robert","rober@Email",'M');

		Book book1 = new Book("Rich Dad Poor Dad",500,1, a1);

		
		System.out.println(book1);



		

		


	}
}