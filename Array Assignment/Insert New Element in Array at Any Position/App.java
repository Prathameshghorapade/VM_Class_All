
import java.util.*;


class App{


static void takeInput(int A[]){

	Scanner scanner = new Scanner(System.in);

	for (int i=0;i<A.length ;i++ ) {

		System.out.println("Eneter Array Element :");
		A[i]=scanner.nextInt();
		
	}
}


    


  static void addNewElementInArray(int A[],int position, int element){
     
     // Create new array with +1 size
       int B[]= new int[A.length+1];


     // Copy elements before position
       for (int i=0;i<position-1 ;i++ ) {

       	B[i]=A[i];
       }


        // Insert new element
       B[position-1]=element;

       for (int i=position;i<=A.length ; i++) {
       	
       	  B[i]=A[i-1];
       }


       System.out.println(Arrays.toString(B));






  }





	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int size=0;
		System.out.println("Eneter Size of An  Array :");

		size=scanner.nextInt();

		int arry[]= new int[size];

		takeInput(arry);

		System.out.println("enetr position of that you want to Add element");

		int position=0;
		position=scanner.nextInt();

			System.out.println("enetr element tha that you want to Add : ");
			int element=0;
		element=scanner.nextInt();




		addNewElementInArray(arry,position,element);




		
	}
}