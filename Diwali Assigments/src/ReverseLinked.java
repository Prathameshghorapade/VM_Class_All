
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLinked {

    public static void reverseList(LinkedList<Integer>nums){

        Collections.reverse(nums);

    }

    public static void main(String[] args) {

        LinkedList<Integer>numbers=new LinkedList<>();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Number Of Elements :");
        int size=scanner.nextInt();

        System.out.println("Enter "+size +"Elements");
        for (int i=0;i<size;i++){
            numbers.add(scanner.nextInt());
        }

        System.out.println("Before"+numbers);

        reverseList(numbers);

        System.out.println("After Reverse"+numbers);













    }
}