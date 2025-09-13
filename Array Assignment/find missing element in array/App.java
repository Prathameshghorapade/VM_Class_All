 
 import java.util.Scanner;

 class App{


     static void findMissingElement(int A[]){

     	int n = A.length+1;

     	int expectedSum=n*(n+1)/2;
     	int actualSum=0;

     	for (int i=0;i<A.length ;i++ ) {
     		actualSum=actualSum+A[i];
     	}
    
          int  ans= expectedSum-actualSum;

          System.out.println("Missing Number :"+ans);

     	}


     	static void takeInput(int A[]){

     		Scanner scanner = new Scanner(System.in);
     		for (int i=0;i<A.length ;i++ ) {
     			System.out.println("Enter Array Element :");
     			A[i]=scanner.nextInt();
     		}
     	}






 	public static void main(String[] args) {
 		
 		
 		Scanner scanner = new Scanner(System.in);
 		int size;

 		System.out.print("Enter Size of Array :");

 		size=scanner.nextInt();


 		int arry[]=new int[size];

 		takeInput(arry);


 		findMissingElement(arry);

 	}
 }