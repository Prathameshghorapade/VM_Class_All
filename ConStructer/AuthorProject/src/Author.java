class Author{

String name;

String email;

char gender;



Author(String Name,String Email,char Gender){

name=Name;
email=Email;
gender=Gender;

}


String getName(){return name;}

String getEmail(){ return email;}


void setEmail(String Email){ email=Email;}

char getGender(){return gender;}


void printAuthor(){

System.out.println("Name of Author :"+name);
System.out.println("Email of Author :"+email);
System.out.println("Gender Of Author :"+gender);


}









}