



class App{


static void sumOfElements(int A[]){

int sum=0;

for(int i=0;i<A.length;i++){

sum=sum+A[i];

}

System.out.print("Sum of Array Elements is :"+sum);

}



public static void main(String args[]){

int arry[]={10,20,30};

sumOfElements(arry);


}



}