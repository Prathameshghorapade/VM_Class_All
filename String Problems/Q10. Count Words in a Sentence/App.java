// Q10. Count Words in a Sentence

import java.util.Scanner;

class App{

static String takeInput(){

	Scanner scanner = new Scanner(System.in);

	System.out.println("Enetr Any Sentence :");

	return scanner.nextLine();
}


static void countWordsInSentence(String input){

	int count=0;

    for (int i=0;i<input.length();i++ ) {
    	
    	if (input.charAt(i)!=' ' && (i==0 || input.charAt(i-1)== ' ')){

    		count++;
    		
    	}
    }

    System.out.println("word count :"+count);

	
}


public static void main(String[] args) {

	String input=takeInput();
	countWordsInSentence(input);
	
}

}