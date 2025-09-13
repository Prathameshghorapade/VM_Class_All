package p3;

import p1.Shape;
public class Rectangle extends Shape{

public double width=1.0;
public double length=1.0;

public Rectangle(){super();}

public Rectangle(double width,double length){
   super();
	this.length=length; this.width=width;}

public Rectangle(double width,double length,String color,boolean filled){

	super(color,filled);
	this.width=width;
	this.length=length;

}

   public double getwidth(){return width;}

   public void setWidth(double width){this.width=width;}

   public double getLength(){return length;}

   public void setLength(double length){this.length=length;}


   @Override
   public double getArea(){

   	return length*width;
   }


   @Override
public double getPerimeter(){
	return 2*(length+width);
}

@Override
public String toString(){
	return "Reactangle --> color :"+ color +" filled :"+ filled;
}



}