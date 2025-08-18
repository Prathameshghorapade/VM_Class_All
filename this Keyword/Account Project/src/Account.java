class Account{

int accountNumber;

double balance;



Account(int accountNumber){this.accountNumber=accountNumber;}



Account(int accountNumber,double balance){this.accountNumber=accountNumber; this.balance=balance;}


int getNumber(){return accountNumber;}

double getBalance(){return balance;}


void credit(double amount){

System.out.println("---------------------------");

balance=balance+amount;

System.out.println("Balance After Credit :"+balance);


System.out.println("---------------------------");
}


void debit(double amount){

System.out.println("---------------------------");

if(amount<=balance){
balance=balance-amount;
System.out.println("balance After Debit :"+balance);}
else
System.out.println("Not Enough Balance to withdraw"+balance);


System.out.println("---------------------------");
}


void transferTo(double amount, Account anotherAccount){

System.out.println("---------------------------");


if(amount<=balance){
this.balance=this.balance-amount;
System.out.println("Amount transfer Successfully");
System.out.println("Remaining Balance :"+this.balance);

anotherAccount.balance=anotherAccount.balance+amount;

System.out.println("---------------------------");
}

else
System.out.println("Not Enough Money To Transfer");

}

void getAccountDetails(){

System.out.println("---------------------------");
System.out.println("Account Number :"+accountNumber);

System.out.println("Balance :"+balance);


System.out.println("---------------------------");

}

}