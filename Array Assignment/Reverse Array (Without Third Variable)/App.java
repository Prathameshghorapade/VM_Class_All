
class App{


static void reaversArry(int a[]){

int i=0;
int j=a.length-1;

while(i<j){

  a[i] = a[i] * a[j];       // Multiply first and last
  a[j] = a[i] / a[j];       // Assign first value to last
   a[i] = a[i] / a[j];       // Assign last value to first

            i++;
            j--;
}


}

static void printArray(int a[]){
for(int i=0;i<a.length;i++)
System.out.println(a[i]);

}





public static void main(String args[]){

int arr[]={1,2,3,4,5};

reaversArry(arr);
printArray(arr);

}







}