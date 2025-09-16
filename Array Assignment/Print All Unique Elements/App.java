  
 import java.util.*;

  class App{

     static void printUnique(int A[]){

         

     	for (int i=0;i<A.length ;i++ ) {
     		
     		if (A[i]==-1) {
     			continue;
     		}

     		int frequency = 1;

     		for (int j=i+1;j<A.length ;j++ ) {
     		if (A[i]==A[j]) {
     			
     			frequency++;

     			A[j]=-1;
     		}

     	}


     	if (frequency==1) {
             System.out.println("Unique Elements Are :");
            System.out.println(A[i]);
        }

     	 
        }

     }


     static void takeInput(int A[]){

     	Scanner sacnner = new Scanner(System.in);

     	for (int i=0;i<A.length ;i++ ) {
     		System.out.println("Enter Array Element");
     		A[i]=sacnner.nextInt();
     	}
     }

        public static void main(String[] args) {

        	Scanner sacnner = new Scanner(System.in);

        	int size=0;

        	System.out.println("Enetr Size of the Array :");

        	size=sacnner.nextInt();

        	int arry[]=new int[size];

        	takeInput(arry);

        	printUnique(arry);
        	


        }
  }