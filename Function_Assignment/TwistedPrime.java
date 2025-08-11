// Twisted Prime --> prime+reverse

import java.util.Scanner;

class TwistedPrime{


static boolean isPrime(int num){

if(num<=1)
return false;

for(int i=2;i<=num/2;i++){

if(num%i==0)
return false;
}
return true;
}


static int reverseNum(int num){

int reverse=0;

while(num>0){

reverse=reverse*10+num%10;

num=num/10;

}

return reverse;

}

static boolean isTwistedPrime(int num){

if(isPrime(num) && isPrime(reverseNum(num)))
return true;
else
return false;

}




public static void main(String args[]){

Scanner sc= new Scanner(System.in);

System.out.println("Enter Number");
int number = sc.nextInt();

if(isTwistedPrime(number))
System.out.println("Twisted Prime");
else
System.out.println("Not Twisted Prime");




}





}

