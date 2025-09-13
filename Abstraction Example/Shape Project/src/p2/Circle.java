package p2;

import p1.Shape;

public class Circle extends Shape{


private double radius=1.2;

 public Circle(){ super();}

public Circle(double radius){ super(); this.radius=radius;}

public Circle(double radius,String color,boolean filled){

	super(color,filled);

	this.radius=radius;
}


double getRadius(){return radius;}

void setRadius(double radius){this.radius=radius;}


@Override
public double getArea(){
 return PI_Val*radius*radius;
}

@Override
public double getPerimeter(){

	return 2*PI_Val*radius;
}

@Override
public String toString(){
	return "Circle --> color :"+ color +" filled :"+ filled;
}






}