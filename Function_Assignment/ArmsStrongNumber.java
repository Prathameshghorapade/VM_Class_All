//Arms Strong Number

import java.util.Scanner;


class ArmsStrongNumber{


static int getCount(int num){

int count=0;
while(num>0){

count++;
num=num/10;

}

return count;

}

static boolean isArmsStrong(int num){


int n = getCount(num);

int sum =0;
int temp=num;


while(temp > 0){

int digit = temp%10;

int power=1;

for(int i=0;i<n;i++){

power=power*digit;

}

sum=sum+power;

temp=temp/10;

}

return sum==num;
}



public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter Number");

int number=sc.nextInt();


if(isArmsStrong(number))

System.out.println(number+"is ArmStrong");

else
System.out.println(number+"is Not an ArmStrong");

}



}