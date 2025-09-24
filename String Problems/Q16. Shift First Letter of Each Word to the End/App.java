/*
Q16. Shift First Letter of Each Word to the End

Problem: Move first character of every word to the end.

Input: hello i am java developer

Output: elloh i ma avaj eveloperd
*/


import java.util.*;

class App{

    static String takeInput(){
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enetr Any Sentence :");

    	return scanner.nextLine();
    }


    static void shiftFirstLetterOfEachWordToLast(String input){

    	String words[]=input.split(" ");
        StringBuilder sb=new StringBuilder();

        for (int i=0;i<words.length;i++ ) {

        	String word =words[i];
        	
        	sb.append(word.substring(1)).append(word.charAt(0));

        	if (i<words.length-1) {
        	sb.append(" ");
        }
        }
    	System.out.println("Output :"+sb.toString());   
    }


	public static void main(String[] args) {

		String input = takeInput();

		shiftFirstLetterOfEachWordToLast(input);
	}
}