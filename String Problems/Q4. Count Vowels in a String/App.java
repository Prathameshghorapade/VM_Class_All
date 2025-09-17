
//Q4. Count Vowels in a String

import java.util.Scanner;

class App{

  static String takeInput(){
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enetr String :");
  return scanner.nextLine();
  }
  
   static void countVoules(String input){

      int count=0;
   	for (int i=0;i<input.length() ;i++ ) {

    char ch = Character.toLowerCase(input.charAt(i));



   		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u'  ) {
   			count++;
   		}

   	}

   	System.out.println("Voules Count :"+count);
   }

	public static void main(String[] args) {
		
		String input = takeInput();

		countVoules(input);




	}
}