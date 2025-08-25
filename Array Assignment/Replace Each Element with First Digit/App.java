class App{


static void replaceWithFirstDigit(int a[]){

for(int i=0;i<a.length;i++){

while(a[i]>=10){
a[i]=a[i]/10;

}
System.out.println(a[i]);
}


}




public static void main(String args[]){

int arry[]={100,200,300,400,509,600,70,80,900000,110};

replaceWithFirstDigit(arry);

}


}