// Q6. Replace Vowels in Reverse with Vowel Count

import java.util.Scanner;

class App{

static String takeInput(){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter String :");
    return scanner.nextLine();
}


static void replaceVouwelsWithReverseVowelCount(String input){

	   int totalVowels=0;

	   
  
       for (int i=0;i<input.length() ;i++ ) {
       	
       	char ch = Character.toLowerCase(input.charAt(i));

       	if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' ) {

             totalVowels++;
       		
       	}
       }

           String result="";

          int  vowelCount =totalVowels;
       for (int i=0;i<input.length() ;i++ ) {
       	
       	char ch = Character.toLowerCase(input.charAt(i));

       	if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' ) {

           result=result+vowelCount;

           vowelCount--;     
        }

        else{

        	result=result+input.charAt(i);
        }
       }

    
     System.out.println("output :"+result);


}


public static void main(String[] args) {
	
	String input = takeInput();

	replaceVouwelsWithReverseVowelCount(input);


}


}