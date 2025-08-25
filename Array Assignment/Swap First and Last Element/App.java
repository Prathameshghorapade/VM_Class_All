class App{

static void swapFirstAndLastEle(int a[]){


 int first=a[0];

for(int i=0;i<a.length-1;i++){

a[0]=a[i+1];

}


for(int i=0;i<a.length;i++){
a[a.length-1]=first;

System.out.println(a[i]);

}

} 



public static void main(String args[]){

int arry[]={23,45,32,33,11};

swapFirstAndLastEle(arry);

}

}
          


           