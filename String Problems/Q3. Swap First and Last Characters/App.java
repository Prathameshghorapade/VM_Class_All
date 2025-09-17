// Q3. Swap First and Last Characters

import java.util.*;

class App{

   static String takeInput(){
   	Scanner scanner = new Scanner(System.in);
   	System.out.println("Enter String that You Want :");
   	return scanner.nextLine();
   }

   static void swapFirstAndLastElement(String input){

   	if (input.length()>1) {

   		String output=input.charAt(input.length()-1)+input.substring(1,input.length()-1)+input.charAt(0);

   		System.out.println("output :"+output);
   		
   	} 
   }


	public static void main(String[] args) {

		String input = takeInput();

		moveFirstElementToLast(input);
		
	}
}