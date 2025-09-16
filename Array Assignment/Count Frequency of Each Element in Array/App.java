 
 import java.util.*;



 class App{


 static void takeInput(int A[]){
 	Scanner scanner = new Scanner(System.in);
 	for (int i=0;i<A.length ;i++ ) {
 		System.out.println("Enter Array Element :");
 		A[i]=scanner.nextInt();
 	}
 }

   static void countFrequency(int A[]){

   	for (int i=0;i<A.length ;i++ ) {
   		
   		if (A[i]==-1) {

   			continue;
   		}

   		int frequncy=1;

   		for (int j=i+1;j<A.length ;j++ ) {
   			
   			if (A[i]==A[j]) {
   				
   				frequncy++;

   				A[j]=-1;
   			}

   		}

   		System.out.println(A[i]+"===>"+ "frequncy "+frequncy);
   	}
   }

   
    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);

    	int size=0;
    	System.out.println("Enter Size of  Array :");
    	size=scanner.nextInt();

    	int array[]=new int[size];

    	takeInput(array);  

    	countFrequency(array);  	

    }

 }


 //our Input Part is Over
 // Next We creating countFrequency and write our logic

 // Done Just Run thhe code 