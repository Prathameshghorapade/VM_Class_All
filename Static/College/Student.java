class Student{

String name;

 static String collegeName="JJM";


Student(String name){ this.name=name;}

void display(){

System.out.println("name :"+name);

}
}


class College{

public static void main(String args[]){

Student stud = new Student("Pratham");

stud.display();



}

}