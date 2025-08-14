class Employee{

int id;

String firstName;

String lastName;

int salary;




Employee(int id,String firstName,String lastName,int salary){

this.id=id;
this.firstName=firstName;
this.lastName=lastName;
this.salary=salary;
}


int getId(){return id;}

String getFirstName(){return firstName;}

String getLastName(){return lastName;}

int getSalary(){return salary;}


String getName(){

return firstName + lastName;

}

void setSalary(int salary){this.salary=salary;}

int getAnnualSalary(){

salary =salary*12;
 return salary;}


int raiseSalary(int percent){

int p=salary*percent/100;

 salary=salary+p;

return salary;

}



void getEmpDetails(int percent){

System.out.println("-------------------");

System.out.println("Emp ID :"+id);

System.out.println("Emp FirstName :"+firstName);

System.out.println("Emp LastName :"+lastName);

System.out.println("Emp Salary :"+salary);

System.out.println("Emp Annual Salary :"+getAnnualSalary());

System.out.println("Emp Raised Salary :"+raiseSalary(percent));

System.out.println("-------------------");



}



}