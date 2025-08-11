// Write a Java program to find the first and last digit of any number.

//1234

//first---4
//last---1


import java.util.Scanner;

class FindFirstAndLastDigit{


static void findDigit(int number){

int lastDigit=number%10;

int firstDigit=number;

while(firstDigit>9){
firstDigit=firstDigit/10;

}
System.out.println("firstDigit"+firstDigit);
System.out.println("lastDigit"+lastDigit);

}

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter Number");
int number = sc.nextInt();

findDigit(number);



}



}