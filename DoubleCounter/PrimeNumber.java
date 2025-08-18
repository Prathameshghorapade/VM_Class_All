import java.util.Scanner;

class PrimeNumber {

    
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;        }

        int i = 2;
        while (i <= num / 2) {
            if (num % i == 0) {
                return false; 
            }
            i++;
        }
                                                                                                                      
        return true; 
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is Not Prime");
        }
    }
}
