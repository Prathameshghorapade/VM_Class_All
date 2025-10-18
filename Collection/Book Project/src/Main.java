import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Book>library=new ArrayList<>();

        int option=0;

        char yesOrNo=' ';
        do {

            System.out.println("Enter 1 : TO Add Book ");
            System.out.println("Enter 2 : Delete Book ");
            System.out.println("Enter 3 : Show All Books ");
            System.out.println("Enter 4 : check Book is Availble or Not ");
            System.out.println("Enter 5 : Exit");

            option=scanner.nextInt();



            switch (option){

                case 1:
                    Book book=addBook();
                       if(library.add(book))
                           System.out.println("Book Added Successfully");
                       else
                           System.out.println("Book Not Added Try Again");
                       break;

                case 2:
                    System.out.println("Enter Info Of Book to Delete  ");
                    Book deleteBook=addBook();
                    if(library.remove(deleteBook)){
                        System.out.println("Book Deleted Successfully ");
                        displayAllBooks(library);
                    }
                    else
                        System.out.println("Book not found to be deleted");

                    break;

                case 3:
                    displayAllBooks(library);
                    break;

                case 4:
                    System.out.println("Enter Book Info");
                    Book findBook=addBook();
                    if(library.contains(findBook))
                        System.out.println("Book found Suceesfully !");
                    else
                        System.out.println("Book Not Found");

                    break;

                case 5:
                    System.out.println("Thank Youuu !");
                    System.exit(0);
            }

            System.out.println("Enter Y or y To Continoue");
            yesOrNo=scanner.next().charAt(0);
        }while (yesOrNo=='Y'|| yesOrNo=='y');



    }



    private static Book addBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Book Id :");
        int id=scanner.nextInt();
        System.out.println("Enter Book Name :");
        scanner.nextLine();
        String name=scanner.nextLine();
        System.out.println("Enter Book Price :");
        double price= scanner.nextDouble();
        System.out.println("Enter Author Name :");
        scanner.nextLine();
        String author=scanner.nextLine();

        Book book=new Book(id,name,price,author);

      return book;
    }

    private static void displayAllBooks(ArrayList<Book>libaray) {

        Iterator<Book>bookIterator=libaray.iterator();

        System.out.println("   BookID   BookName    Price   Author   ");

        while (bookIterator.hasNext()){

            Book book=bookIterator.next();
            System.out.print("   "+book.getBookId()+"   ");
            System.out.print("   "+book.getBookName()+"   ");
            System.out.print("   "+book.getBookPrice()+"   ");
            System.out.println("  "+book.getAuthorName()+"   ");

            System.out.println("_____________________________________-");
        }
    }
}