class Person{


String name;

int age;



Person(String initialName){

name=initialName;

}



void printPerson(){

System.out.println("Name of Person :"+name);

System.out.println("Age of Person :"+age);



}



void growOlder(){
age++;
System.out.println("Age After Growing :" +age);

}


int returnAge(int Age){

return age=Age;

}


boolean isOfLegalAge(int age){

if(age>18)
return true;

else
return false;

}

String getName(String Name){

return name=Name;
}


// 2d contructor
Person(String Name,int Age){

name=Name;
age=Age;


}


void personDetails(){

System.out.println("---------------------------------");

 printPerson();

growOlder();

if(isOfLegalAge(age))
System.out.println("Leagal Age");
else
System.out.println("ILLeagal Age");

System.out.println("---------------------------------");  
}







}