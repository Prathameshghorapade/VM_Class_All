class App{


static void forwardDisplay(int A[]){

for(int i=0;i<A.length;i++)

System.out.println(A[i]);

}



static void backWordDisplay(int A[]){


for(int i=A.length-1;i>=0;i--)

System.out.println(A[i]);


}



public static void main(String args[]){

int arry[]={10,20,30,40,50};

System.out.println("Forward Display :");
forwardDisplay(arry);


System.out.println("BackWord Display :");
 backWordDisplay(arry);



}




}