import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Taking Input
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter Size Of Array");

        int size=scanner.nextInt();

        int []arry=new int[size];

        System.out.println("Enter "+size+" Elements");

        for (int i = 0; i < size; i++) {
            arry[i]=scanner.nextInt();
        }

        //Two Pointer Apporach to revrse Array Elements

        int low=0;
        int high=arry.length-1;

        //swap
        while (low<high){

           int temp= arry[low];

           arry[low]=arry[high];

           arry[high]=temp;

           low++;
           high--;
        }

        // printing the array

        System.out.println(Arrays.toString(arry));

    }
}