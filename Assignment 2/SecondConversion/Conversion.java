// Write a Java program to convert seconds to hours, minutes and seconds.


class Conversion{

public static void main(String args[]){


   long seconds = 9199666;

  long hours = seconds/3600;

  long minutes = (seconds % 3600) / 60;

  long second = seconds % 60;


System.out.println("In Hourse :"+hours);

System.out.println("In Minutes :"+minutes);

System.out.println("In Seconds :"+second);






  

}



}