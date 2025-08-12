class Circle{

double radius;
String color;
double borderWidth;
String borderColor;


void getCircleDetails(){

System.out.println("radius :"+radius);

System.out.println("Color :"+color);

System.out.println("Border Width :"+borderWidth);

System.out.println("Border Color :"+borderColor);

}


void setRadius(double Radius){radius=Radius;}
void setColor(String Color){color=Color;}
void setBorderWidth(double BorderWidth){borderWidth=BorderWidth;}
void setBorderColor(String BorderColor){borderColor=BorderColor;}
}