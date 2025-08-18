class App{

public static void main(String args[]){

Account account = new Account(2777,10000);

account.getAccountDetails();

account.credit(1000);

account.debit(500);

account.transferTo(10000);


Account account2 = new Account(45,100);

account2.transferTo(100,account2);


account2.getAccountDetails();



}




}