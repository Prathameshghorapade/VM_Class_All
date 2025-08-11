// Perfect Square

import java.util.Scanner;

class PerfectSquare{


static Boolean isPerfect(int num){

int squareRoot=(int)Math.sqrt(num);

return squareRoot*squareRoot==num;

}






public static void main(String args[]){

Scanner sc= new Scanner(System.in);
System.out.println("Enter Number");

int number=sc.nextInt();

if(isPerfect(number))
System.out.println("Perfect Square");
else
System.out.println("Not Perfect Square");



}


}