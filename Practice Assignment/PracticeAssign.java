import java.util.Scanner;

class PracticeAssign{

public static void main(String[]args){

Scanner sc = new Scanner(System.in);

// Write a  Java  program to find maximum between two numbers.

/*
System.out.println("Enter First Number :");
int num1=sc.nextInt();

System.out.println("Enter Second Number :");
int num2=sc.nextInt();

if(num1<num2)
System.out.println("Num2 is grater "+num2);
else
System.out.println("Num1 is grater "+num1); */


//Write a  Java  program to find maximum between three numbers.

/*
System.out.println("Enter First Number :");
int num1=sc.nextInt();

System.out.println("Enter Second Number :");
int num2=sc.nextInt();

  
System.out.println("Enter Third Number :");
int num3=sc.nextInt();

if(num1>num2 && num1>num3)

System.out.println("Num1 is grater "+num1);

else if(num2>num1 && num2>num3)

System.out.println("Num2 is grater "+num2);

else
System.out.println("Num3 is grater "+num3); */



// Write a  Java  program to check whether a number is negative, positive or zero.

/*
System.out.println("Enter Number :");
int number=sc.nextInt();

if(number>0)
System.out.println( number +" " + "Number is Positive");

else if(number<0)
System.out.println( number +" " + "Number is Negative");

else if(number==0)
System.out.println( number +" " + "Number is Equal to Zero");

else 
System.out.println("Enter Valid Number"); */




// Write a  Java  program to check whether a number is divisible by 5 and 11 or not.

/*
System.out.println("Enter Number :");
int number=sc.nextInt();

if(number%5==0 && number%11==0)
System.out.println("Number is Divisible by Both 5 And 11 ");

else if(number%5==0)
System.out.println("Number is Divisible by 5 ");

else if(number%11==0)
System.out.println("Number is Divisible by 11 ");

else
System.out.println("You Entered Wrong number "); */




//  Write a  Java  program to check whether a number is even or odd.



/*
System.out.println("Enter Number :");
int number=sc.nextInt();

if(number%2==0)
System.out.println(number+ " "  + "Number is Positive");

else
System.out.println(number+ " "  + "Number is Negative"); */




// Write a  Java  program to check whether a year is leap year or not.

/*
System.out.println("Enter Year :");
int year=sc.nextInt();

if( (year % 4 == 0 && year %100 !=0)  || year % 400 == 0)

System.out.println(year + " " + "is Leap Year");

else
System.out.println(year + " " + "is Not a Leap Year"); */



// Write a  Java  program to check whether a character is alphabet or not. also vowel;

/*
System.out.print("Enter Character : ");
char character =sc.next().charAt(0);


if((character>='A' && character<='Z') || (character>='a' && character<='z') )

System.out.println("It is an Alphabet");

else
System.out.println("It is Not an Alphabet"); */






// Write a  Java  program to input any alphabet and check whether it is vowel or consonant.


/*
System.out.print("Enter Alphabet : ");
char alphabet =sc.next().charAt(0);

 if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' ||  alphabet == 'A' || alphabet == 'E' ||
      alphabet == 'I' || alphabet == 'O' || alphabet == 'U') 

     System.out.println("It is Vowel.");
            
else
System.out.println("It is consonant"); */




//Write a  Java  program to input any character and check whether it is alphabet, digit or special character.

/*
System.out.print("Enter Alphabet : ");
char character =sc.next().charAt(0);

if((character>='A' && character<='Z') || (character>='a' && character<='z'))

System.out.print(character + " " + "is a Alphabet");

else if(character>='0' && character<='9')
System.out.print(character + " " + "is a Digit");

else
System.out.print(character + " " + "is a Special Character"); */




//Write a  Java  program to check whether a character is uppercase or lowercase alphabet.

/*
System.out.print("Enter Alphabet : ");
char character =sc.next().charAt(0);

if(character>='A' && character<='Z' )
System.out.print(character + " " + "is UpperCase");

else if(character>='a' && character<='z')
System.out.print(character + " " + "is LowerCase");

else
System.out.print("Enter Valid Character");

*/





// Write a  Java  program to input week number and print week day.

/*

System.out.println("Enter Number Between 1 to 7 :");
int number=sc.nextInt();


if(number==1)
System.out.println("SunDay");

else if(number==2)
System.out.println("MonDay");

else if(number==3)
System.out.println("TuesDay");

else if(number==4)
System.out.println("WednesDay");

else if(number==5)
System.out.println("ThursDay");

else if(number==6)
System.out.println("FriDay");

else if(number==7)
System.out.println("SaturDay");

else
System.out.println("Enter Valid Number Between 1 to 7 Only");

*/





// Write a  Java  program to input month number and print number of days in that month.

/*
System.out.println("Enter Month Number Between 1 to 12 :");
int MonthNumber=sc.nextInt();

if(MonthNumber==1 || MonthNumber==3 || MonthNumber==5 || MonthNumber==7 || MonthNumber==8 || MonthNumber==10 || MonthNumber==12  )
System.out.println("31 Days");

else if(MonthNumber==4 || MonthNumber==6 || MonthNumber==9 || MonthNumber==11)
System.out.println("30 Days");

else if(MonthNumber==2)
System.out.println("28 or 29 Days");

else
System.out.println("Enter Valid Number BetWeen 1 to 12");

*/




// Write a  Java  program to input angles of a triangle and check whether triangle is valid or not.



/*
System.out.println("Enter First Angle of Triangle :");
int firstAngle=sc.nextInt();


System.out.println("Enter Second Angle of Triangle :");
int secondAngle=sc.nextInt();


System.out.println("Enter Third Angle of Triangle :");
int ThirdAngle=sc.nextInt();



if((firstAngle>0 && secondAngle>0 && ThirdAngle>0 ) && (firstAngle+secondAngle+ThirdAngle==180))
System.out.println("This is a Valid Trangle");

else
System.out.println("This is Not a Valid Trangle");
*/






// Write a  Java  program to input all sides of a triangle and check whether triangle is valid or not.



/*

System.out.println("Enter First Side of Triangle :");
int firstSide=sc.nextInt();


System.out.println("Enter Second Side of Triangle :");
int secondSide=sc.nextInt();


System.out.println("Enter Third Side of Triangle :");
int ThirdSide=sc.nextInt();



if((firstSide>0 && secondSide>0 && ThirdSide>0 ) && ((firstSide+secondSide>ThirdSide) && (secondSide+ThirdSide>firstSide)&& (firstSide+ThirdSide>secondSide) ))
System.out.println("This is a Valid Trangle");

else
System.out.println("This is Not a Valid Trangle");

*/







// Write a  Java  program to check whether the triangle is equilateral, isosceles or scalene triangle.


/*

System.out.println("Enter First Side of Triangle :");
int firstSide=sc.nextInt();


System.out.println("Enter Second Side of Triangle :");
int secondSide=sc.nextInt();


System.out.println("Enter Third Side of Triangle :");
int ThirdSide=sc.nextInt();

if (firstSide > 0 && secondSide > 0 && ThirdSide > 0 &&
            (firstSide + secondSide > ThirdSide) && (firstSide + ThirdSide > secondSide) && (secondSide + ThirdSide > firstSide)) 
{
 if(firstSide==secondSide && secondSide==ThirdSide  )
System.out.println("This is Equilateral Trangle");

else if(firstSide==secondSide ||  secondSide==ThirdSide ||  firstSide==ThirdSide)
System.out.println("This is Isosceles Trangle");

else 
System.out.println("This is Scalene Trangle");

}
else 
System.out.println("Enter Valid Sides");

*/




/*

  Write a  Java  program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.
 Calculate percentage and grade according to following:
    Percentage >= 90% : Grade A
    Percentage >= 80% : Grade B
    Percentage >= 70% : Grade C
    Percentage >= 60% : Grade D
    Percentage >= 40% : Grade E
    Percentage < 40% : Grade F


*/




/*

System.out.println("Enter Physics Marks :");
int physics=sc.nextInt();

System.out.println("Enter Chemistry Marks :");
int chemistry=sc.nextInt();


System.out.println("Enter Biology Marks :");
int biology=sc.nextInt();

System.out.println("Enter Mathematics Marks :");
int mathematics=sc.nextInt();


System.out.println("Enter Computer Marks :");
int computer=sc.nextInt();




int percentage = (physics+chemistry+biology+mathematics+computer)/5;
System.out.println(percentage+"%");

if(percentage>=90)
System.out.println("Grade A!!");

else if(percentage>=80 && percentage<90)
System.out.println("Grade B!!");

else if(percentage>=70 && percentage<80)
System.out.println("Grade C!!");

else if(percentage>=60 && percentage<70)
System.out.println("Grade D!!");

else if(percentage>=40 && percentage<60)
System.out.println("Grade E!!");


else if(percentage<40 )
System.out.println("Fail!!");


*/








/*

Write a  Java  program to input basic salary of an employee and
 calculate its Gross salary according to following:

    Basic Salary <= 10000 : HRA = 20%, DA = 80%
    Basic Salary <= 20000 : HRA = 25%, DA = 90%
    Basic Salary > 20000 : HRA = 30%, DA = 95%

*/

/*
double houseRentAllowance=0;
double dearnessAllowance=0;
double grossSalary=0;

System.out.println("Enter Basic Salary :");
double basicSalary=sc.nextDouble();



if(basicSalary<=10000){

houseRentAllowance= basicSalary * 0.20;

dearnessAllowance=  basicSalary * 0.80;
} 
 
else if(basicSalary<=20000){

houseRentAllowance= basicSalary * 0.25;

dearnessAllowance=  basicSalary * 0.90;
} 

else if(basicSalary>20000){

houseRentAllowance= basicSalary * 0.30;

dearnessAllowance=  basicSalary * 0.95;
} 



 grossSalary= basicSalary + houseRentAllowance +dearnessAllowance;

System.out.println("Your Basic Salary is "+basicSalary);
System.out.println("Your Gross Salary is "+grossSalary);


*/




















}


}