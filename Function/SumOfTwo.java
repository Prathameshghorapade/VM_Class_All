// Write a program to enter two numbers and find their sum.


import java.util.Scanner;

class SumOfTwo{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter num1 :");
int num1=sc.nextInt();

System.out.println("Enter num2 :");
int num2=sc.nextInt();

int result= sum(num1,num2);

System.out.println("Sum of Two Numbers is :" +result);


}


static int sum(int a ,int b){

return a+b;



}





}