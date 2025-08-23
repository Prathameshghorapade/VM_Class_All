class App{

static void sumOfOddElements(int A[]){
int sum=0;

for(int i=0;i<A.length;i++){

if(A[i]%2==1)

sum=sum+A[i];

}




System.out.println("Sum Of Odd Elements is :"+sum);


}



public static void main(String args[]){

int arry[]={11,22,33,44,55};

sumOfOddElements(arry);




}

}