//Append Sum of Digit at the End of the Digit

//ex 1234
//sum 10
//result 123410

//1.Find Sum
//2.Find Count
//3.Find multiplier

import java.util.Scanner;

class AppendSumOfDigitAtFirst{


static int sumOfDigit(int number){
int sum=0;

while(number>0){

sum=sum+number%10;

number=number/10;

}

return sum;

}


static int getMultiplier(int num){
int multiplier=1;

while(num>=1){
multiplier=multiplier*10;

num--;

}

return multiplier;
}


static int getCount(int n){
int count=0;
while(n>0){

count++;

n=n/10;


}

return count;


}






public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter Number");

int number = sc.nextInt();

int sum=sumOfDigit(number);


int count=getCount(number);

int multiplier=getMultiplier(count);


int result=sum*multiplier+number;

System.out.println(result);








}



}