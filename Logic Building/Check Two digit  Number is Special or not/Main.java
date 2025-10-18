import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a Two Digit Number :");
        int num=scanner.nextInt();

        int lastDigit,firstDigit;

        lastDigit=num%10;

        firstDigit=(num/10)%10;

        int special=(firstDigit+lastDigit)+(firstDigit*lastDigit);

        System.out.println(special==num ? "Number is Special " :"Number is Not Special");

    }
}