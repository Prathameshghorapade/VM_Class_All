// Write a  program to enter two angles of a triangle and find the third angle.




import java.util.Scanner;

class FindThirdAngle{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter First Angle  :");
int angle1=sc.nextInt();

System.out.println("Enter Second Angle  :");
int angle2=sc.nextInt();


int result= thirdAngle(angle1,angle2);




System.out.println("Third Angle IS :" +result);





}


static int thirdAngle(int a,int b){
return 180-(a+b);
}





}