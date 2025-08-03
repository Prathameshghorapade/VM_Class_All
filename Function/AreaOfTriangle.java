// Write a  program to calculate the area of an equilateral triangle.



import java.util.Scanner;

class AreaOfEquilateralTriangle{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter side of equilateral triangle :");
double base=sc.nextDouble();


double result= thirdAngle(base,height);


System.out.println("Area of equilateral Triangle :" +result);


}


static double area(int a) {
return(Math.sqrt(3) / 4) * a * a;
}





}