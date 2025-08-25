class App{

static int target=150;


static void findPairOfTargetSum(int a[]){

for(int i=0;i<a.length;i++){

for(int j=1;j<a.length;j++){

for(int k=2;k<a.length;k++){

if(a[i]+a[j]+a[k]==target){

System.out.println("Pairs :"+a[i]+"  "+a[j]+"  "+a[k] );

}




}
}

}


}





public static void main(String args[]){

int arry[]={10,20,30,40,50,60,70,80,90,100,110,120,150,200};

findPairOfTargetSum(arry);






}}