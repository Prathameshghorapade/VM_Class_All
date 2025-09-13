//Write a  Java  program to copy all elements from an array to another array.

import java.util.*;

class App{

	static void takeInput(int A[]){
		Scanner scanner=new Scanner(System.in);
		for (int i=0;i<A.length ;i++ ) {
			System.out.println("Enetr Array Elements :");
			A[i]=scanner.nextInt();
		}
	}

 


	static void copyAllElements(int A[]){

		int B [] = new int[A.length];

		for (int i=0;i<A.length ;i++ ) {
			B[i]=A[i];
		}

		System.out.println("OLD Array "+Arrays.toString(A));

		System.out.println("New Array "+Arrays.toString(B));

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int size=0;
		System.out.println("Enter Size of An Array :");
		size=scanner.nextInt();

		int arry[]=new int[size];

		takeInput(arry);

		copyAllElements(arry);




		
	}
}