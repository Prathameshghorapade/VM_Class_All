
import java.util.*;


class App{

   static void takeInput(int A[]){
    Scanner scanner=new Scanner(System.in);
    for (int i=0;i<A.length ;i++ ) {
    	System.out.print("Enter Arry Element :");
       A[i]=scanner.nextInt();
    }

   }


  

   static void findDuplicates(int A[]){

   	for (int i=0;i<A.length ;i++ ) {
   		for (int j=i+1;j<A.length ;j++ ) {
   			if (A[i]==A[j]) {
   				System.out.println("Duplicate Element is :"+A[i]);
   			}
   		}
   	}
   }



	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size;
   System.out.println("Enter Size of Arry");

    size=scanner.nextInt();

    int arry[]= new int[size];

    takeInput(arry);
    findDuplicates(arry);




		
	}
}