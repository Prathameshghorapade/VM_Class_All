/*
 Q15. Append Length of Each Word

Problem: Add length of each word at the end of the word.

Input: hello i am java developer

Output: hello5 i1 am2 java4 developer9

*/

import java.util.*;

class App{

	static String takeInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Any Sentence :");

		return scanner.nextLine();
	}

  
    static void appendLengthOfEachWord(String input){

    	String[]words=input.split(" ");
    	StringBuilder sb=new StringBuilder();

    	for (int i=0;i<words.length;i++ ) {
    		sb.append(words[i]).append(words[i].length());

    			if (i<words.length-1) {
     		sb.append(" ");
     	}
    	}

    	System.out.println("output :"+sb.toString());
    } 
  


	public static void main(String[] args) {

		String input=takeInput();

		appendLengthOfEachWord(input);

		
	}
}