//  Write a  program to enter P, T, R and calculate Simple Interest.
    




import java.util.Scanner;

class CalSimpleIntrest{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);

 System.out.println("Enter Principal : ");
 double principal = sc.nextDouble();

 System.out.println("Enter Time in years : ");
 double time = sc.nextDouble();

 System.out.println("Enter Rate of interest : ");
 double rate = sc.nextDouble();




double result=intrest(principal,time,rate);



System.out.println("simpleIntrest is :"+result);



}


static double intrest (double p,double t,double r) {
return (p*t*r)/100;
}




}