/*
Q11. Sort Words Lexicographically

Problem: Sort all words in dictionary (alphabetical) order.

Input: hello i am java developer

Output: am developer hello i java
*/



import java.util.*;

class App{

   static String takeInput(){
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter Any Sentence :");

      return scanner.nextLine();
   }

     static void sortLexicographically(String input){
 
         String[]words=input.split(" ");

         for (int i=0;i<words.length;i++ ) {
         	for (int j=i+1; j<words.length;j++ ) {
         		if (words[i].compareTo(words[j])>0) {
         			
         			String tempt=words[i];
         			words[i]=words[j];
         			words[j]=tempt;
         		}
         	}
         }

         System.out.println("output :"+Arrays.toString(words));

     }

	public static void main(String[] args) {

		String input=takeInput();

		sortLexicographically(input);

		
	}
}