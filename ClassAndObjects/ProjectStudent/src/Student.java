class Student{

String StudentName;
int StudentId;
int roolNo;
String Email;
String Address;



void getStudentDetails(){

System.out.println("Student Name :"+StudentName);
System.out.println("Student Id :"+StudentId);
System.out.println("Student Roll Number :"+roolNo);
System.out.println("Student Email :"+Email);
System.out.println("Student Address :"+Address);
}


void setStudentName(String name){StudentName=name;}
void setStudentId(int id){StudentId=id;}
void setRollNo(int Roll){roolNo=Roll;}
void setStudentEmail(String mail){Email=mail;}
void setStudentAddress(String address){Address=address;}

}