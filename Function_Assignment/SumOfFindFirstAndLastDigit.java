// Write a Java program to find the sum of the first and last digit of any number.
   

//1234

//first---4
//last---1
//sum=5


import java.util.Scanner;

class SumOfFindFirstAndLastDigit{


static void findDigit(int number){
int sum=0;
int lastDigit=number%10;

int firstDigit=number;

while(firstDigit>9){
firstDigit=firstDigit/10;

}
System.out.println("firstDigit"+firstDigit);
System.out.println("lastDigit"+lastDigit);

sum=firstDigit+lastDigit;

System.out.println(sum);



}



public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter Number");
int number = sc.nextInt();

findDigit(number);



}



}