// append two digit 
//    int a=123; int b=234;
//    res=123234

import java.util.Scanner;
class AppendTwoNums{

static int countDigits(int num2){
int count=0;
while(num2>0){
 count++;

num2=num2/10;
}
return count; 
}

static int getMultiplier(int n){

int multiplier = 1;

while(n>=1){

multiplier=multiplier*10;
n--;

}
return multiplier;
}



public static void main(String args[]){

Scanner sc= new Scanner(System.in);

System.out.println("Enter Num 1");
int num1=sc.nextInt();

System.out.println("Enter Num 2");
int num2=sc.nextInt();

int cntDigits=countDigits(num2);

int multiplier=getMultiplier(cntDigits);

int result=num1*multiplier+num2;

System.out.println(result);


}


}