class Mobile{

int price;
String color;

String typeOfMobile;

String company;

String model;

int storage;


void getMobileDetail(){

System.out.println("Price :"+price);

System.out.println("Color :"+color);

System.out.println("Type of Mobile :"+typeOfMobile);

System.out.println("Company :"+company);

System.out.println("Model :"+model);

System.out.println("Storage :"+storage);
}


void setPrice(int Price){price=Price;}

void setColor(String Color){color=Color;}


void setTypeOfMobile(String TypeOfMobile){typeOfMobile=TypeOfMobile;}


void setCompany(String Company){company=Company;}

void setModel(String Model){model=Model;}

void setStorage(int Storage){storage=Storage;}


}