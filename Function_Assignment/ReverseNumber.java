import java.util.Scanner;
class ReverseNumber{


static int revers(int num){

int reverse=0;

while(num>0){

reverse=reverse*10+num%10;

num = num/10;

}
return reverse;

}



public static void main(String args[]){


Scanner sc= new Scanner(System.in);
System.out.println("Enetr Number");

int number = sc.nextInt();

int revserNumber=revers(number);

System.out.println(revserNumber);




}



}