//shift first digit to last
//      1234  --> 2341


import java.util.Scanner;

class ShiftFirstDigitToLast{


static int getCount(int num){

int count =0;

while(num>0){
count++;
num=num/10;

}

return count;
}


static int getMultiplier(int num){

int multiplier=1;

while(num>1){

multiplier=multiplier*10;
num--;

}

return multiplier;
}







public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("Enter Number");

int number = sc.nextInt();

int digit =getCount(number);

int multiplier=getMultiplier(digit);

int firstDigit = number/multiplier;

int remaining=number%multiplier;

int result = remaining*10+firstDigit;

System.out.println(result);








}






}