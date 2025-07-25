import java.util.Scanner;
class SwitchCase{

public static void main(String [] args){

Scanner sc=new Scanner(System.in);



// Write a Java program to print day of week name using switch case.


/*

System.out.println("Enter Number betWeen 1 to 7");

int num=sc.nextInt();


switch(num){

case 1:System.out.println("Sunday");
break;

case 2:System.out.println("MonDay");
break;

case 3:System.out.println("TuesDay");
break;

case 4:System.out.println("WednesDay");
break;

case 5:System.out.println("ThursDay");
break;

case 6:System.out.println("FriDay");
break;

case 7:System.out.println("SaturDay");
break;

default:System.out.println("Enter Valid Day Between 1 to 7");
break;

} */




// Write a Java program print total number of days in a month using switch case.


/*

System.out.println("Enter Number betWeen 1 to 12");

int num=sc.nextInt();


switch(num){

case 1:System.out.println(" Jan --> 31 Days");
break;

case 2:System.out.println(" Feb --> 28 or 29 Days");
break;

case 3:System.out.println(" March -->31 Days");
break;

case 4:System.out.println(" April --> 30 Days");
break;

case 5:System.out.println(" May --> 31 Days");
break;

case 6:System.out.println(" June --> 30 Days");
break;

case 7:System.out.println(" July --> 31 Days");
break;

case 8:System.out.println(" Aug --> 31 Days");
break;

case 9:System.out.println(" Sept --> 30 Days");
break;

case 10:System.out.println(" Oct --> 31 Days");
break;

case 11:System.out.println(" Nov --> 30 Days");
break;

case 12:System.out.println(" Dec --> 31 Days");
break;


default:System.out.println("Enter Valid Number Between 1 to 12");
break;

} */





// Write a Java program to check whether an alphabet is vowel or consonant using switch case.



/*
System.out.println("Enter Any Alphabet :");

char alphabet=sc.next().charAt(0);


switch(alphabet){

case 'a':System.out.println(" a is Vowel");
break;

case 'e':System.out.println(" e is Vowel");
break;

case 'i':System.out.println(" i is Vowel");
break;

case 'o':System.out.println(" o is Vowel");;
break;

case 'u':System.out.println(" u is Vowel");
break;

case 'A':System.out.println(" A is Vowel");
break;

case 'E':System.out.println(" E is Vowel");
break;

case 'I':System.out.println(" I is Vowel");
break;

case 'O':System.out.println(" O is Vowel");
break;

case 'U':System.out.println(" U is Vowel");
break;


default:System.out.println(" It is Consonent");;
break;

} */





// Write a Java program to find maximum between two numbers using switch case.

/*

System.out.println("Enter Any Alphabet :");

int alphabet=sc.next().charAt(0);


switch(alphabet){

case 'a':System.out.println(" a is Vowel");
break;

case 'e':System.out.println(" e is Vowel");
break;

case 'i':System.out.println(" i is Vowel");
break;

case 'o':System.out.println(" o is Vowel");;
break;

case 'u':System.out.println(" u is Vowel");
break;

case 'A':System.out.println(" A is Vowel");
break;

case 'E':System.out.println(" E is Vowel");
break;

case 'I':System.out.println(" I is Vowel");
break;

case 'O':System.out.println(" O is Vowel");
break;

case 'U':System.out.println(" U is Vowel");
break;


default:System.out.println(" It is Consonent");;
break;

} */







// Write a Java program to find maximum between two numbers using switch case.

/*
System.out.println("Enter Num1 :");
int num1=sc.nextInt();

System.out.println("Enter Num1 :");
int num2=sc.nextInt();

int max;

max=(num1==num2) ? 0 : (num1>num2 ? 1:2);


switch(max){

case 0 : System.out.println(" Both Are Equal");
break;

case 1 : System.out.println(num1 + " Is Greater");
break;

case 2 : System.out.println(num2+ " Is Greater");
break;

} */




//  Write a Java program to check whether a number is even or odd using switch case.

/*
System.out.println("Enter Number :");
int num=sc.nextInt();



  int result=(num%2==0) ? 0 : 1;

switch(result){

case 0 : System.out.println( num +" is Even");
break;

case 1 : System.out.println( num +" is Odd");
break;

} */







System.out.println("Enter First Number :");
int num1=sc.nextInt();



System.out.println("Enter Operator + - / * % :");
char opearator=sc.next().charAt(0);



System.out.println("Enter Second Number :");
int num2=sc.nextInt();




switch(opearator){


case '+' : System.out.println("Addition is :"+ (num1 + num2));
break;

case '-' : System.out.println("Subtraction is :"+ (num1 - num2));
break;

case '*' : System.out.println("Multiplication is :"+ (num1 * num2));
break;

case '/' :

           if(num2 != 0)
          System.out.println("Division is :"+ (num1 + num2));
         
         else 
           System.out.println("Can't Divide By Zero");
break;
         
      
 default : System.out.println("Enter Valid Operator!!");
break;
}


















}





}