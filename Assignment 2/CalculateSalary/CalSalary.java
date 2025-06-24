// Ramesh’s basic salary is input through the keyboard. His dearness allowance is 40% of basic salary,
 // and house rent allowance is 20% of basic salary.
// Write a program to calculate his gross salary.


class CalSalary{

 public static void main(String args[]){

    double salary = 25000;

 
   double dearnessAllowance = 0.40 * salary;
   
   double HouseRentAllowance = 0.20 * salary;

  double grossSalary = dearnessAllowance + HouseRentAllowance + salary;

  System.out.println("Gross Salary is :"+grossSalary);


}


}