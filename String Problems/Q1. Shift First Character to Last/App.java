
//Move the first character of the string to the end.


import java.util.*;
class App{

	static String takeInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String that You Want :");

		return scanner.nextLine();
		
	}


   static String moveFirstCharToLast(String input){
      if (input.length()>1) {

      	String newOutPut=input.substring(1)+input.charAt(0);

      	return newOutPut;	
      }else
      return input;
   }


   public static void main(String[] args) {

   	     String input=takeInput();

   	     

   	    String result= moveFirstCharToLast(input);

   	    System.out.println("output :"+result);


   	
   }

}