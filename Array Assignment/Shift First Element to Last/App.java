class App{


static void shiftFirstToLast(int A[]){

int first =A[0];

for(int i=0;i<A.length-1;i++){

A[i]=A[i+1];

}

for(int i=0;i<A.length;i++){

A[A.length-1]=first;

System.out.println(A[i]);

}


}


public static void main(String args[]){


int arry[]={10,20,30,40,50};


shiftFirstToLast(arry);


}



}