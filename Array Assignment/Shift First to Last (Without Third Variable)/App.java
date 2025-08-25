// Shift First to Last (Without Third Variable)


// 1  2  3  4  5  

// 


class App{


static void shiftFirstToLast(int arry[]){

// 1 2 3 4 5




 for (int i = 0; i < arry.length - 1; i++) {

  arry[i] = arry[i] + arry[i + 1];      // Sum current & next
   arry[i + 1] = arry[i] - arry[i + 1];  // Next becomes current
   arry[i] = arry[i] - arry[i + 1];      // Current becomes next
  

 }








for(int i=0;i<arry.length;i++)
System.out.println(arry[i]);



}




public static void main(String args[]){

int ary[]={1,2,3,4,5};
shiftFirstToLast(ary);



}



}