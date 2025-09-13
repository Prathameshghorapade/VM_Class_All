//  Write a  Java  program to count total number of negative elements in an array.

import java.util.Scanner;

class App{

static void takeInput(int A[]){
	Scanner scanner = new Scanner(System.in);
	for (int i=0;i<A.length ;i++ ) {
		System.out.println("Enetr Array elements");
		A[i]=scanner.nextInt();
	}
}

static void countNegativeElements(int A[]){
	int count=0;
	for (int i=0;i<A.length ;i++ ) {
		
		if (A[i]%2==1) {
			count++;
		}
	}
   System.out.println("Count of Total Odd Elements in Arrays is : "+count);

}



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int size=0;
		 System.out.println("Enter Size Of An Array :");

		 size=scanner.nextInt();

		 int arry[]= new int[size];

		 takeInput(arry);

		 countNegativeElements(arry);

		
	}
}