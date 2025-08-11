// Palindromic prime ---> palindrome + prime


import java.util.Scanner;

class PalindromicPrime{



static boolean  isPalindrome(int num){

int reverse=0;
int temp=num;

while(num>0)
{

reverse=reverse*10+num%10;

num=num/10;

}

return reverse==temp;

}




static boolean isPrime(int num){
if(num<=1)
return false;

for(int i=2;i<=num/2;i++){
if(num%i==0)
return false;

}
return true;

}


static boolean isPalindromicPrime(int num){

if(isPrime(num) && isPalindrome(num))

return true;
else
return false;

}



public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter Number");
int number=sc.nextInt();

if(isPalindromicPrime(number))

System.out.println("PalindromicPrime Number");

else
System.out.println("NOT Palindromic Number");



}



}