// Write a Java program to count the number of digits in any number.

import java.util.Scanner;
class CountDigit{


static int countDigit(int number){

int count=0;
while(number>0){

int digit=number%10;
count++;

number=number/10;

}
return count;

}


public static void main(String args[]){

Scanner sc= new Scanner(System.in);

System.out.println("Enter Number");
int number = sc.nextInt();

int result=countDigit(number);

System.out.println(result);



}
}