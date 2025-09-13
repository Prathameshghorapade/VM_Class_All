// Write a Java program to print all negative elements in an array.


import java.util.*;

class App{


static void takeInput(int A[]){
	Scanner scanner = new Scanner(System.in);
	for (int i=0;i<A.length;i++ ) {
		System.out.println(" Enter Array Elements ");
		A[i]=scanner.nextInt();
	}
           
}

static void printAllNegativeElements(int A[]){
	for (int i=0;i<A.length ;i++ ) {
		if (i%2==1) {
			System.out.print("["+i+"]");
		}
		
	}
}




public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.println(" Enter Array Size ");

	int size=0;
	size=scanner.nextInt();

	int arry[]= new int[size];

	takeInput(arry);

	printAllNegativeElements(arry);
	

}

}