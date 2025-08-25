 class App{



static void ShiftLastToFirst(int A[]){

int last =A[A.length-1];



for(int i=A.length-1;i>0;i--){

A[A.length-1]=A[i-1];

}

A[0]=last;



for(int i=0;i<A.length;i++)

System.out.println(A[i]);

}






public static void main(String args[]){

int arry[]={10,20,30,40,50};

ShiftLastToFirst(arry);



}


}