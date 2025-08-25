class App{

static int target=40;


static void findPairOfTargetSum(int a[]){

for(int i=0;i<a.length;i++){

for(int j=1;j<a.length;j++){

if(a[i]+a[j]==target){

System.out.println("Pairs :"+a[i]+"  "+a[j]);

}

}

}


}








public static void main(String args[]){

int arry[]={10,20,30,40,50};

findPairOfTargetSum(arry);






}}