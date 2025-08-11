// Perfect Cube
import java.util.Scanner;

class PerfectCube{

static boolean isPerfectCube(int num){

int cube=(int)Math.cbrt(num);

return cube*cube*cube==num;

}



public static void main(String args[]){

Scanner sc= new Scanner(System.in);
System.out.println("Enter Number");
int number=sc.nextInt();

if(isPerfectCube(number))
System.out.println("Perfect Cube");
else
System.out.println("Not Perfect Cube");



} 





}
