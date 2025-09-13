// Write a  Java  program to count total number of even and odd //elements in an array.


import java.util.Scanner;


class App{

static void takeInput(int A[]){
	Scanner scanner = new Scanner(System.in);
	for (int i=0;i<A.length ;i++ ) {
		System.out.println("Enter Array Elements :");
		A[i]=scanner.nextInt();
	}
}

static void countOddAndEvenNums(int A[]){
 int evenCount=0;
 int oddCount=0;

 for (int i=0;i<A.length ;i++ ) {
 	if (A[i]%2==0) 
 		evenCount++;

 	else
    oddCount++;
 	
 }

 System.out.println("Event Numbers Count in Array :"+evenCount);
  System.out.println("Odd Numbers Count in Array :"+oddCount);


}



public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	int size=0;
	System.out.println("Enetr Size Of An Array :");
	size=scanner.nextInt();

	int arry[]= new int[size];

	takeInput(arry);

	countOddAndEvenNums(arry);


	
}

}