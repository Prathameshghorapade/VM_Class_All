
//Move the last character of the string to the front.

import java.util.*;

class App{

static String takeInput(){
	Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter String that You Want :");
     return scanner.nextLine();
}


static void moveLastCharToFirst(String input){
	if (input.length()>1) {
		
		char lastChar =input.charAt(input.length()-1);
		String remaining = input.substring(0,input.length()-1);

		String result=lastChar+remaining;

		System.out.println("output :"+result);


	}

  
}


public static void main(String[] args) {

	String str=takeInput();

	moveLastCharToFirst(str);


	
}

}