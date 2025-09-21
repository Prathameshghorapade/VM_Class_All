/*  
 Q14. Append Word Position to Each Word

Problem: Append word number (starting from 1) to each word.

Input: hello i am java developer

Output: hello1 i2 am3 java4 developer5

*/


import java.util.*;

class App{

 static String takeInput(){
 	Scanner scanner = new Scanner(System.in);
 	System.out.println("Enter Any Sentence :");

 	return scanner.nextLine();
 }


  static void appendWordWithPosition(String input){

     StringBuilder sb=new StringBuilder();
     String words[]=input.split(" ");

     for (int i=0;i<words.length;i++ ) {

     	sb.append(words[i]).append(i+1);

     	if (i<words.length-1) {
     		sb.append(" ");
     	}
     		
     	}


     	System.out.println(sb.toString());
     }

     

  


	public static void main(String[] args) {

		String input=takeInput();

		appendWordWithPosition(input);
		
	}
}