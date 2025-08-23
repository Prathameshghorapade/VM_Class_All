class App{

static void avarageOfElements(int A[]){

int avg=0;
int sum=0;

for(int i=0;i<A.length;i++){

sum=sum+A[i];

}
avg=sum/A.length;

System.out.println("Average is :"+avg);

}



public static void main(String args[]){

int arry[]={10,20,30,40,50};

avarageOfElements(arry);


}

}