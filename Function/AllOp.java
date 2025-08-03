// Write a  program to enter two numbers and perform all arithmetic operations.



import java.util.Scanner;

class AllOp{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter num1 :");
int num1=sc.nextInt();

System.out.println("Enter num2 :");
int num2=sc.nextInt();

int addition= add(num1,num2);

int subtraction= sub(num1,num2);

int multiplication= mul(num1,num2);

int divison= div(num1,num2);

int modulus= mod(num1,num2);



 System.out.println("Addition of Two Numbers is :" +addition);

 System.out.println("Subtraction of Two Numbers is :" +subtraction);


System.out.println("Multiplication of Two Numbers is :" +multiplication);


System.out.println("Divison of Two Numbers is :" +divison);


System.out.println("Modulus of Two Numbers is :" +modulus);



}


static int add(int a ,int b){
return a+b;
}



static int mul(int a ,int b){
return a*b;
}

static int div(int a ,int b){
return a/b;
}


static int mod(int a ,int b){
return a%b;
}



static int sub(int a ,int b){
return a-b;
}


}