 //We can Write Multiple Exceptions in one Catch

 import java.util.*;

 class Demo{

   public static void main(String[] args) {

   	int num1=0;int num2=0;int result=0;

   	String str=null;

   	try{

   		Scanner scanner = new Scanner(System.in);

   	

    System.out.println("Enter Num 1 :");
    num1=scanner.nextInt();

    System.out.println("Enter Num 1 :");
     num2=scanner.nextInt();

 		result=num1/num2;

 		System.out.println(str.length());
  }catch(InputMismatchException | NullPointerException | ArithmeticException e){

   System.out.println(e);
   System.out.println("Message "+e.getMessage());



  }
 	

 	System.out.println("result"+result);
  System.out.println("Sucessss");
   	
   
   }


 }