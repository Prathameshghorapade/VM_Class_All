class Account{

int accountNumber;

double balance;



Account(int AccountNumber,double Balance){

accountNumber=AccountNumber;
balance=Balance;

}

int getAccountNumber(){return accountNumber;}

double getBalance(){return balance;}



void setBalance(double Balance){ balance=Balance;}


void credit(int amount){


System.out.println(" Balance After Credit :" +(balance+amount));

}

void debit(int amount){ 

System.out.println("Reamaning Balance After Debit :"+(balance-amount));

}



void printAccountDetails(){


System.out.println("Account Number :"+accountNumber);

System.out.println("Balance :"+balance);

}




}






