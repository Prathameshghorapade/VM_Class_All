// Write a  program to enter the length and breadth of a rectangle and find its area.


import java.util.Scanner;

class AreaOfReactangle{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter length of Rectangle :");
int length=sc.nextInt();

System.out.println("Enter breadth of Rectangle:");
int breadth=sc.nextInt();

int result= area(length,breadth);

System.out.println("Perimeter Of Reactangle Is :" +result);


}


static int area(int a ,int b){

return a*b;



}





}