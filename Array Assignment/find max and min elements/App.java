//  Write a  Java  program to find maximum and minimum element in 
// an array.





import java.util.Scanner;

class App{

static void takeInput(int A[]){
	Scanner scanner = new Scanner(System.in);
	for (int i=0;i<A.length ;i++ ) {
		System.out.println("Enter Array Elements ");
		A[i]=scanner.nextInt();
	}
}

  

 static void findMaxAndMinElement(int A[]){
 	int max=A[0];
 	int min=A[0];

 	for (int i=0;i<A.length ;i++ ) {

 		if (A[i]>max) {
 			max=A[i];
 		}
 		if (A[i]<min) {
 			min=A[i];
 		}
 		
 	}

 	System.out.println("Maximum element in Array is :"+max);
 	System.out.println("Maximum element in Array is :"+min);
 }





public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int size=0;
	System.out.print("Enter Size of An Array :");
	size=scanner.nextInt();

	int arry[]= new int[size];

	takeInput(arry);

	findMaxAndMinElement(arry);

	
}

}
