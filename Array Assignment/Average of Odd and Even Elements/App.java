class App{


static int avg=0;
static int sum=0;
static int cnt=0;

static void avarageOfOddElements(int A[]){

for(int i=0;i<A.length;i++){






if(A[i]%2==1){


System.out.print(A[i]+" ");
sum=sum+A[i];
cnt=cnt+1;

}


}
avg=sum/cnt;
System.out.println();
System.out.println("Average of Odd Elements is :"+avg);

}




static void avarageOfEvenElements(int A[]){

for(int i=0;i<A.length;i++){



if(A[i]%2==0){
sum=sum+A[i];
System.out.print(A[i]+" ");
cnt=cnt+1;
}

}
avg=sum/cnt;

System.out.println();

System.out.println("Average of Even Elements is :"+avg);

}



public static void main(String args[]){

int arry[]={11,22,33,44,55,66,77};

avarageOfOddElements(arry);

avarageOfEvenElements(arry);


}


}