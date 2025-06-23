// Write a  program to enter marks of five subjects and calculate total, average and percentage.


class Avg{

public static void main(String args[]){

   int sub1=35;
   int sub2=35;
   int sub3=35;
   int sub4=35;
   int sub5=35;


  int total = sub1+sub2+sub3+sub4+sub5;
  System.out.println("Total :"+total);


  double avg = total/5.0;
System.out.println("avg :"+avg);


double percentage = (total/500.0)*100;
System.out.println("percentage :"+percentage);

}


}