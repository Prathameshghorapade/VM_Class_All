class App{

static void maxNumber(int arry[]){

int max=arry[0];

for(int i=0;i<arry.length;i++){

if(arry[i]>max){

max=arry[i];

}

}

System.out.println("Max Number :"+max);
}





public static void main(String args[]){

int arry[]={1,20,3,4,5};

maxNumber(arry);




}


}