
class StaticBlock{

static{

System.out.println("Static Block Executed");

}
}


class Main{


public static void main(String args[]){
StaticBlock s1 = new StaticBlock();

System.out.println("Main method Executed");


}

}

// here output will be
// Static Block Executed
  Main method Executed

// because when we created new object of StaticBlock , the static Block will first executed the main 











class Main{


static{

System.out.println("Static Block Executed");

}

public static void main(String args[]){


System.out.println("Main method Executed");


}

}  // here first static block executed then main 





// we Can write multiple Static Block in class 


class Main{


static{

System.out.println("Static Block Executed");

}

static{

System.out.println("Static Block Executed");

}

public static void main(String args[]){


System.out.println("Main method Executed");

}

static{

System.out.println("Static Block Executed");

}
static{

System.out.println("Static Block Executed");

}


} // in this program output will be 
  // Static Block Executed
  // Static Block Executed
    // Static Block Executed
     // Static Block Executed
    // Main method Executed




// Importnat Note that  

// We Can't Write or Access static Block Inside Main method

// It does not have a name like show or main.

//It does not take parameters.

//It does not have a return type.





