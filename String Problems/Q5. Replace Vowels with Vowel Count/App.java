// Q5. Replace Vowels with Vowel Count

import java.util.Scanner;

class App{

static String takeInput(){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter String :");
	return scanner.nextLine();
}

static void replaceVowelsWithVowlesCount(String input){

    int count=0;
    String result="";
	for (int i=0;i<input.length() ;i++ ) {
		
		char ch = Character.toLowerCase(input.charAt(i));

		if (ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'  ) {

			count++;

			result=result+count;
			
		}else{

			result=result+input.charAt(i);
		}
	}

	System.out.println("Output :"+result);

}

public static void main(String[] args) {
	
	String input = takeInput();

	replaceVowelsWithVowlesCount(input);
}

}