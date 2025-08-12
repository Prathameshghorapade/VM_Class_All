class Room{

String color;

int roomNumber;

boolean isFanAvilable;

int capacity;

String location;


void roomDetail(){

System.out.println("Room Number : "+roomNumber);

System.out.println(" Location: "+location);

System.out.println("Capacity of Room : "+capacity);

System.out.println("Color of room : "+color);

System.out.println("Is Fan Avilable In Room : "+isFanAvilable);

}


void setRoomNumber(int newRoomNumber){roomNumber=newRoomNumber;};
void setLocation(String Location){location=Location;};
void setCapacity(int Capacity){capacity=Capacity;};
void setColor(String Color){color=Color;};
void setFanAvilableOrNot(boolean IsFanAvilable){isFanAvilable=IsFanAvilable;};








}