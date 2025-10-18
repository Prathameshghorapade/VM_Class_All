import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int arry[][]=new int[3][3];
        System.out.println("Enter 9 Array Elements :");

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                arry[i][j]=scanner.nextInt();
            }
        }


        //square

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {

                System.out.println(arry[i][j]*arry[i][j]);
            }
        }
        System.out.println(" ");
    }
}