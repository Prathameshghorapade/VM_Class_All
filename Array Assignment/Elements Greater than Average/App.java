class App{

static int sum=0;
static double avg=0;


static void avrageOfElements(int A[]){

for(int i=0;i<A.length;i++){

sum=sum+A[i];

}
avg=sum/A.length;

System.out.println("Average is:"+avg);
}


static void compareAvgWithElements(int A[]){

for(int i=0;i<A.length;i++){

if(A[i]>avg){

System.out.println(A[i]);

}


}


}



public static void main(String args[]){

int arry[]={5,10,15,20,25};

avrageOfElements(arry);

compareAvgWithElements(arry);


}



}