//  Write a  program to enter P, T, R and calculate Simple Interest.
    




import java.util.Scanner;

class SimpleIntrest{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);

 System.out.print("Enter Principal : ");
 double principal = sc.nextDouble();

 System.out.print("Enter Time in years : ")
 double time = sc.nextDouble();

 System.out.print("Enter Rate of interest : ");
 double rate = sc.nextDouble();






double result=simpleIntrest (principal,time,rate);



System.out.println("simpleIntrest is :"+result);









}


static int simpleIntrest(int p,int t,int r,) {
return (p*t*r)/100;
}









}