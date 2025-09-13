package p1;


public abstract class Shape{


  public String color;
  public boolean filled;

   final public double PI_Val=3.14;

     public Shape(){this.color = "";
        this.filled = false;}

    public Shape(String color,boolean filled){this.color=color;this.filled=filled;}
     
     String getColor(){return color;}
     void setColor(String color){this.color=color;}
     boolean isFilled(){return filled;}
     void setFilled(boolean filled){this.filled=filled;}

     public abstract double getArea();

    public abstract double getPerimeter();


   @Override
   public String toString(){
 
   return "color :"+  color  +"filled :"+ filled;

   }

}