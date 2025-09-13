package p5;

import p1.Shape;
import p2.Circle;
import p3.Rectangle;
import p4.Square;



public class App{

  public static void main(String[] args) {
  	
  	Shape circle = new Circle(2.0,"red",true);

  	Shape rectangle = new Rectangle(3.0,2.3,"blue",false);

  	Shape square = new Square(4.0,"yellow",true);



  	System.out.println(circle);

    System.out.println(rectangle);

  	System.out.println(square);



  }


}