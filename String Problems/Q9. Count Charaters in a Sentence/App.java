// Q9. Count characters in a Sentence

import java.util.Scanner;

 class App{

 	static String takeInput(){
 		Scanner scanner =new Scanner(System.in);
 		System.out.println("enter Any Sentence :");

 		return scanner.nextLine();
 	}

    static void countWordsInSentence(String input){
 
      int count=0;

      for (int i=0;i<input.length();i++) {
      	if (input.charAt(i)==' '){
      		continue;
      	}
      	else{

      		count++;
      	}
      }

      System.out.println(count);


    }

 	public static void main(String[] args) {

 		String input=takeInput();

 		countWordsInSentence(input);



        		
 	}
 }