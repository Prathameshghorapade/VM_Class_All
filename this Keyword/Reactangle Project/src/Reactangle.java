class Reactangle{


float length=1.0f;

float width =1.0f;



Reactangle(){}


Reactangle(float length,float width){

this.length=length;

this.width=width;

}


float getLength(){return length;}

float getWidth(){return width;}

void setLength(float length){this.length=length;}

void setWidth(float width){this.width=width;}


double getArea(){

double area=length*width;

return area;}


double getPerimeter(){

double perimeter=(length+width)*2;

return perimeter;

}


void printReactangle(){

System.out.println("-------------------");

System.out.println("Length :"+length);


System.out.println("Width :"+width);


System.out.println("Area of Reactangle :"+getArea());


System.out.println("Perimeter Of Reactangle :"+getPerimeter());

System.out.println("-------------------");

}




}