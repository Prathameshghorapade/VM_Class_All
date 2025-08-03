// Write a  program to enter the base and height of a triangle and find its area.




import java.util.Scanner;

class FindThirdAngle{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter base  :");
int base=sc.nextInt();

System.out.println("Enter height  :");
int height=sc.nextInt();


int result= thirdAngle(base,height);




System.out.println("Area of Triangle :" +result);





}


static int thirdAngle(int a,int b){
return 0.5*a*b;
}





}