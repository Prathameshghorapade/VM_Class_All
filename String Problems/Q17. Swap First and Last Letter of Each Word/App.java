/*Q17. Swap First and Last Letter of Each Word

Problem: Swap the first and last character of each word.

Input: hello i am java developer

Output: oellh i ma avaj revelopd
*/

import java.util.*;

class App{

  static String takeInput(){
  	Scanner scanner = new Scanner(System.in);
  	System.out.println("Enter any Sentence :");

 	return scanner.nextLine();
  }


  static void swapFirstAndLastLetter(String input){

  	 String []words=input.split(" ");

  	 StringBuilder sb=new StringBuilder();
     
     for (int i=0;i<words.length;i++ ) {
     	
        String word=words[i];

        if (word.length()>1) {
        	
        	char first=word.charAt(0);
        	char last=word.charAt(word.length()-1);

        	String middle=word.substring(1,word.length()-1);

        	sb.append(last).append(middle).append(first);
        }else{
        	sb.append(word);
        }

        if (i < words.length - 1) {
                sb.append(" ");
            }
     }

     System.out.println("Output: " + sb.toString());
  }




	public static void main(String[] args) {

		String input=takeInput();

		swapFirstAndLastLetter(input);
		
	}
}