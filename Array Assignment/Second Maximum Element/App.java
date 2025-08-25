class App{

static int max=0;
static int max2=0;


static void findMax(int a[]){


for(int i=0;i<a.length;i++){

if(a[i]>max){
max=a[i];

}
}

System.out.println("Maximu number is :" +max);
}


static void secondMaxNum(int ary[]){



for(int i=0;i<ary.length;i++){

if(ary[i]>max2 && ary[i]<max)

max2=ary[i];

}

System.out.println("Second Max Num :"+max2);
}





public static void main(String args[]){

int arry[]={1,2,3,4,50,6};

findMax(arry);
secondMaxNum(arry);



}



}