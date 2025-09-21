/*✅ Q13. Reverse Each Word in Sentence

Problem: Reverse each individual word in the sentence.

Input: hello i am java developer

Output: olleh i ma avaj repoleved
*/

import java.util.*;

class App{

static String takeInput(){
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter ANy Senetence");
	return scanner.nextLine();
}


static void revereEachWord(String input){

	String words[]=input.split(" ");

	 StringBuilder result=new StringBuilder();


  for (String word:words) {

  	StringBuilder sb=new StringBuilder(word);
  	result.append(sb.reverse()).append(" ");
   	
   } 

   System.out.println("output :"+result.toString());

}




	public static void main(String[] args) {
		
		String input=takeInput();

		revereEachWord(input);
	}
}