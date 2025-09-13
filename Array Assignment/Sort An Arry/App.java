
import java.util.*;

class App{


    static void takeInput(int A[]){
      Scanner scanner = new Scanner(System.in);
      for (int i=0;i<A.length ;i++ ) {
      	System.out.println("Enter Arry Element ");
      	A[i]=scanner.nextInt();
      }

    }


    static void displayArry(int A[]){
    	for (int i=0;i<A.length ;i++ ) {
    		// System.out.println(A[i]+ " ");

    	}
    	System.out.println(Arrays.toString(A));
    }


  


    static void sortArray(int A[]){

    	for (int i=0;i<A.length ;i++ ) {
    	for (int j=i+1;j<A.length ;j++ ) {
    	    		
    	    		     
    	    if (A[i]>A[j]) {
                                
            			int temp=A[i];
    	    			 
    	    			A[i]=A[j];
                          
    	    			A[j]=temp;
	
    	    			}	

    	    		}    		
    	}
    }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size;
		System.out.println("Enter Size ");

		size=scanner.nextInt();

		int arry[]=new int[size];

		takeInput(arry);
		sortArray(arry);
		displayArry(arry);

	}
}