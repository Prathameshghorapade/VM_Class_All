class Book{

int price;
String bookName;
String authorName;

int totalPages;

String language;





void getBookDetails(){
System.out.println("Book Name :"+bookName);
System.out.println("Price :"+price);
System.out.println("Author Name :"+authorName);
System.out.println("Total Pages :"+totalPages);
System.out.println("Language :"+language);

}

void setBookName(String BookName){bookName = BookName;}
void setPrice(int Price){price = Price;}
void setAuthorName(String AuthorName){authorName = AuthorName;}
void setTotalPages(int TotalPages){totalPages = TotalPages;}
void setLanguage(String Language){language = Language;}




}