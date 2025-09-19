//Q8. Sort All Characters Alphabetically

import java.util.Scanner;

class App{


static String takeInput(){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enetr Any String :");

	return scanner.nextLine();
}


  static void sortAllCharaters(String input){

  	String result="";

      input = input.toLowerCase();

      char[]eachElemet=input.toCharArray();

      for (int i=0;i<eachElemet.length ;i++ ) {
      	for (int j=i+1;j<eachElemet.length;j++ ) {
      		
      		if (eachElemet[i]>eachElemet[j]) {

      			char tempt=eachElemet[j];

      			eachElemet[j]=eachElemet[i];
      			eachElemet[i]=tempt;
      		}
      	}
      }

      result=new String(eachElemet);

      System.out.println(result);


  }

	public static void main(String[] args) {

		String input=takeInput();

		sortAllCharaters(input);
		
	}
}