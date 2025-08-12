class Person{

 String name;
 int age;
 String gender;
 String address;
 String email;


void getDetails(){

System.out.println("Name of Person : "+name);

System.out.println("Age of Person : "+age);

System.out.println("Address : "+address);

System.out.println("Email : "+email);

System.out.println("Gender : "+gender);


}


void setName(String personName){ name=personName;}

void setAge(int personAge){ age=personAge;}

void setAddress(String newAddress){ address=newAddress;}

void setEmail(String newEmail){ email=newEmail;}

void setGender(String newGender){ gender=newGender;}




String getName(){ return name;}

int getAge(){ return age;}

String getAddress(){ return address;}

String getEmail(){ return email;}

String getGender(){ return gender;}





}