class Account{

int accountNumber;
String accountType;
String holderName;
String address;
String email;




void getAccountDetail(){

System.out.println("Account Number :"+accountNumber);

System.out.println("Account Type :"+accountType);

System.out.println("Account Holder Name :"+holderName);

System.out.println("Account Holder Address :"+address);

System.out.println("Accoun Holder Email :"+email);
}


void setAccountNumber(int number){accountNumber=number;}
void setAccountType(String type){accountType=type;}
void setAccountHolderName(String name){holderName=name;}
void setAddress(String Address){address=Address;}
void setEmail(String Email){email=Email;}

}