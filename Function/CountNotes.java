import java.util.Scanner;

class CountNotes{

static void count(int amount){

int note2000=0;
int note500=0;
int note100=0;

if(amount>=2000){
 note2000 = amount/2000;
amount = amount%2000;
}

if(amount>=500){

 note500 = amount/500;
amount = amount%500;
}

if(amount>=100){

note100 = amount/100;
amount = amount%100;
}


if( note2000>0){

System.out.println("note2000"+" "+note2000);
}

if(note500>0){

System.out.println("note500"+" "+note500);
}

if(note100>0){

System.out.println("notes 100"+" "+note100);
}


}


public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter Amount");
int amount=sc.nextInt();

count(amount);


}


}