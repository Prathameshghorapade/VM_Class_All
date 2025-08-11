//Strong Number

import java.util.Scanner;


class StrongNumber{


static int factorial(int num){

int fact=1;

while(num>0){
fact=fact*num;
num--;
}

return fact;

}


static boolean isStrong(int num){

int sum=0;
int temp=num;

while(temp>0){

int digit=temp%10;

sum=sum+factorial(digit);
temp=temp/10;

}

return sum==num;
}


public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter a Number");
int number = sc.nextInt();

if(isStrong(number))
 System.out.println(number+"is Strong");
else
 System.out.println(number+"is Not Strong");








}


}