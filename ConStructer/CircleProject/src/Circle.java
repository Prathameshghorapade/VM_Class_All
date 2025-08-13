class Circle{


double radius;

String color;

Circle( ){ 


}


Circle(double Radius){

radius=Radius;

}


Circle(double Radius,String Color){

radius=Radius;
color=Color;

}


double getRadius(){

return radius;

}


String getColor(){

return color;

}



void getArea(){


System.out.println("Area of Circle :" +3.14*radius*radius) ;


}



void displayCircle(){

System.out.println("Radius Of Circle :"+radius);

System.out.println("Color Of Circle :"+color);

getArea();

System.out.println("---------------------------------");

}



}