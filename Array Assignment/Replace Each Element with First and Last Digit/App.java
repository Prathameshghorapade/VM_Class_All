class App{


static void findFirstAndLastDigit(int a[]){

for(int i=0;i<a.length;i++){

int num=a[i];

int lastDigit=num%10;


while(num>=10){

num=num/10;

}

int firstDigit=num;

System.out.println(firstDigit+" "+ lastDigit);

}






}








public static void main(String args[]){

int arry[]={100,200,300,400,509,600,70,80,900000,110};

findFirstAndLastDigit(arry);


}


}