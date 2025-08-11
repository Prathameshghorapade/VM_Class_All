// Nth palindrome number

import java.util.Scanner;

class NthPalindromeNum{


static boolean isPalindrome(int num){

int tempt=num;
int reverse=0;

while(num>0){

reverse=reverse*10+num%10;

num = num/10;
}

return reverse==tempt;
}


public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter Number");
int number = sc.nextInt();

int count=0;
int n=0;


while(count<number){

n++;

if(isPalindrome(n)){

count++;
}

}

System.out.println(number +"th Palidrone Number is"+ n);

}

}









