// Write a  program to enter the radius of a circle and find its diameter, circumference and area.



import java.util.Scanner;

class CirclOp{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter Radius  :");
double radius=sc.nextDouble();


double result1= diameter(radius);

double result2= circumference(radius);

double result3= area(radius);



System.out.println("diameter of A Circle Is :" +result1);

System.out.println("circumference of A Circle Is :" +result2);

System.out.println("Area of A Circle Is :" +result3);


}


static double diameter(double a){
return 2*a;
}

static double circumference(double a){
return 2*3.14*a;
}

static double area(double a){
return 2*a*a;
}






}