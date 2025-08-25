//Swap First and Last Element (Without Third Variable)


class App{

static void  swapFirstAndLastEleWithoutThirdVar(int arry[ ]){
// 1 2 3 4 5

arry[0]=arry[0]+arry[arry.length-1];

// 6 2 3 4 5

arry[arry.length-1]=arry[0]-arry[arry.length-1];

// 6 2 3 4 1

arry[0]=arry[0]-arry[arry.length-1];

// 5 2 3 4 1 


for(int i=0;i<arry.length;i++)
System.out.println(arry[i]);

}




public static void main(String args[]){

int arry[]={1,2,3,4,5};

swapFirstAndLastEleWithoutThirdVar(arry);

}



}