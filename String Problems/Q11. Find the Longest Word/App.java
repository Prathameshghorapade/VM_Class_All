//Q10. Find the Longest Word

import java.util.Scanner;

class App{

static String takeInput(){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter any Sentence :");
	return scanner.nextLine();
}


static void longestWord(String input){

	String spliteString[]=input.split(" ");

	String longestWord="";

	for (int i=0;i<spliteString.length;i++ ) {
		
		if (spliteString[i].length() > longestWord.length()) {
			
			longestWord=spliteString[i];
		}
	}

	System.out.println("Longest Word :"+longestWord);
	System.out.println("Longest Word Length :"+longestWord.length());

}

  public static void main(String[] args) {
  	
  	String input=takeInput();
  	longestWord(input);


  }


}