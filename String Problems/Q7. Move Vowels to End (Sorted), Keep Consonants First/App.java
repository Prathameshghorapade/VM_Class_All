// Q7. Move Vowels to End (Sorted), Keep Consonants First

import java.util.Scanner;

class App{

 static String takeInput(){
 	Scanner scanner = new Scanner(System.in);
 	System.out.println("Enter Any String :");

 	return scanner.nextLine();
}
 
 
  
 static void moveVowelsAndSort(String input){

 	String vowels="";
 	String  consonantes="";
 	String result="";

 	for (int i=0;i<input.length();i++ ) {
 		
 		char eachCharacter = Character.toLowerCase(input.charAt(i));

 	    if (eachCharacter=='a'||eachCharacter=='e'||eachCharacter=='i'||eachCharacter=='o'||eachCharacter=='u') {

 	    	vowels=vowels+eachCharacter;

 	     } else{

 	     	consonantes=consonantes+eachCharacter;
 	     }
 	}
        

          char sortedVowels[]=vowels.toCharArray();
            
       for (int i=0;i<sortedVowels.length;i++ ) {
	 
       	   for (int j=i+1;j<sortedVowels.length;j++ ) {

       	   	if (sortedVowels[i]>sortedVowels[j]){
       	   		
       	   		char tempt=sortedVowels[j];
       	   		sortedVowels[j]=sortedVowels[i];
       	   		sortedVowels[i]=tempt;
        	}
       	   }
       }

      result=consonantes+new String(sortedVowels);

      System.out.println(result);
 }



	public static void main(String[] args) {

		String input = takeInput();

		moveVowelsAndSort(input);
		
	}
}