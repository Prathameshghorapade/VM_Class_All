
import java.util.*;






class App{



	static void takeInput(int A[],int B[]){

	Scanner scanner = new Scanner(System.in);

	for (int i=0;i<A.length ;i++ ) {

		System.out.println("Enter first Array Elements");
		A[i]=scanner.nextInt();
	}

	System.out.println("Enter Second Array Elements");

	for (int i=0;i<B.length ;i++ ) {

		System.out.println("Enter Second Array Elements");
		B[i]=scanner.nextInt();
	}
}





    static void displayArry(int A[]){
    	
    	System.out.println(Arrays.toString(A));
    }

static void mergeTwoArrays(int A[],int B[],int C[]){


	for (int i=0;i<A.length ;i++ ) {
		C[i]=A[i];
	}

	for (int i=0;i<B.length ;i++ ) {
		C[i+A.length]=B[i];
	}

    

}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int size;

		System.out.println("Enter Size of Array");

		size=scanner.nextInt();

		int arry1[]=new int[size];
		int arry2[]=new int[size];

		int arry3[]=new int[arry1.length+arry2.length];

		takeInput(arry1,arry2);
      mergeTwoArrays(arry1,arry2,arry3);

		displayArry(arry3);


	}
}