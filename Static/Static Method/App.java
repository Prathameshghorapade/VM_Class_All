class Calculation{

static int square(int number){ // Static method

return number*number;

}


}



class App{

public static void main(String args[]){

System.out.println(Calculation.square(5)); // here i called static method directly using className without creating an object


}

}


// Key Concepts in This Program

//Static Method

//Can be called without creating an object.

//Called using ClassName.methodName().

//Example here: Calculation.square(5).

//Encapsulation of Logic

//The logic for squaring a number is kept inside a separate utility class (Calculation).

//This makes the code reusable — if you want to square any number, just call Calculation.square(n).

//Separation of Concerns

//Calculation → handles mathematical operations.

//App → handles execution (main method).
