//  Write a  Java  program to find sum of all array elements. 

import java.util.*;




class App{


	static void takeInput(int A[]){

	Scanner scanner = new Scanner(System.in);
    for (int i=0;i<A.length ;i++ ) {
    	System.out.println("Enter Array Elements");
    	A[i]=scanner.nextInt();
    }
}

 static void sumOfAllArrayElements(int A[]){
 		int sum =0;
 	for (int i=0;i<A.length ;i++ ) {

 		sum=sum+A[i];
 	}

 	System.out.println(" Sum of Array Elements is :"+sum);


 }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of Array :");
		int size=0;
		size=scanner.nextInt();

		

		int arry[]= new int[size];

		takeInput(arry);

		sumOfAllArrayElements(arry);



		
	}

}