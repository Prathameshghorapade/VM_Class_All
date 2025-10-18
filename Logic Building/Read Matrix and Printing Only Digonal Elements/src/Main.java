import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[][]=new int[3][3];

        System.out.println("Enter 9 Array Elements:");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                array[i][j]=scanner.nextInt();
            }
        }

        //printing diagonal

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {

                if (array[i]==array[j]){
                    System.out.println(array[i][j]);
                }else{
                    System.out.println("");
                }
            }
//            System.out.println();
        }

    }
}