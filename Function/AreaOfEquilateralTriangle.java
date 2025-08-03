//  Write a  program to enter marks of five subjects and calculate total, average and percentage.
    




import java.util.Scanner;

class StudentsMarks{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter Mark of Subject 1 :");
int sub1= sc.nextInt();

System.out.println("Enter Mark of Subject 2 :");
int sub2= sc.nextInt();

System.out.println("Enter Mark of Subject 3 :");
int sub3= sc.nextInt();


System.out.println("Enter Mark of Subject 4 :");
int sub4= sc.nextInt();


System.out.println("Enter Mark of Subject 5 :");
int sub5= sc.nextInt();




double result1= total(sub1+sub2+sub3+sub4+sub5);

double result2= average(result1);

double result3= percentage(result1);






System.out.println("Total marks :" +result1);


}


static double total(int a,int b,int c,int d,int e) {
return a+b+c+d+e;
}

static double average(double total) {
return a/5.0;
}

static double percentage(double total) {
return (a/500.0)*100;
}








}