// Perfect Number

import java.util.Scanner;

class PerfectNum{

static void printFactor(int num){
for(int i=1;i<num;i++){
if(num%i==0)
System.out.println(i);
}

} 


static boolean isPerfectNumber(int num){

int sum=0;
for(int i=1;i<num;i++){

if(num%i==0)
sum=sum+i;

}
return num==sum;

}



public static void main(String args[]){

Scanner sc= new Scanner(System.in);

System.out.println("Enter Number");
int number=sc.nextInt();

boolean perfect= isPerfectNumber(number);
System.out.println(perfect);





}

}