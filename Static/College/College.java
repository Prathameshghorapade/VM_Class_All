// Example of Static Variable;

class Student{

String studentName; // Instance variable (unique for each object)

static String collegeName="JJM"; // Static Variable same for everyone,  shared by all objects


Student(String studentName){ this.studentName=studentName; }

void display(){ 
System.out.println("name :"+studentName);
System.out.println("College Name:"+collegeName);

 }

}


class College{


public static void main(String args[]){

Student stud = new Student("Pratham");

Student stud2 = new Student("Rutu");

stud.display();

stud2.display();


}


}

//studentName → instance variable (each student has their own name).

//collegeName → static variable (same for all students, "JJM").

//Constructor → initializes studentName when a new student object is created.

//display() method → prints both student’s name and college name.