 //try with multiple catch

 import java.util.*;

 class App{

   public static void main(String[] args) {

   	int num1=0;int num2=0;int result=0;

   	String str=null;

   	try{

   		Scanner scanner = new Scanner(System.in);

   	

    System.out.println("Enter Num 1 :");
    num1=scanner.nextInt();

    System.out.println("Enter Num 1 :");
     num2=scanner.nextInt();

   	}catch(InputMismatchException e){
   		System.out.println(e);
   		System.out.println("message :"+e.getMessage());
 	}

 	try{

 		result=num1/num2;
 		
 	}catch(ArithmeticException e){
 		System.out.println(e);
   		System.out.println("message :"+e.getMessage());
 	}

 	try{

 		System.out.println(str.length());
 	}catch(Exception e){
 		System.out.println(e);
   		System.out.println("message :"+e.getMessage());
 	}

 	System.out.println("result"+result);
   	
   
   }


 }