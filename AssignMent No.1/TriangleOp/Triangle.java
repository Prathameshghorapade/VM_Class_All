// Write a  program to enter two angles of a triangle and find the third angle.


 class Triangle{

  public static void main(String args[]){

   int angle1=45;
   int angle2=45;
  
       int angle3 = 180 - (angle1+angle2);

       System.out.println("Angle3 is :"+angle3);

}
    

}






//  Write a  program to enter base and height of a triangle and find its area.



class Triangle{

  public static void main(String args[]){

   double base=45;
   double height=45;
  
        double area = 0.5 * base * height;
       System.out.println("Area is :"+area);

}
    

}








// Write a  program to calculate area of an equilateral triangle.


class Triangle{

  public static void main(String args[]){

   double side =5;
   double squareRootOf3=1.732;
  
         double area = (squareRootOf3 / 4) * side * side;
         System.out.println("Area: " + area);
}
    

}