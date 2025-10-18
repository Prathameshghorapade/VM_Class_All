import java.util.ArrayList;

public class EvenAndOdd {

    public static void main(String[] args) {

        int []arry={2,3,4,5,6,7,78,5,4,32,23};

        ArrayList<Integer>even=new ArrayList<>();
        ArrayList<Integer>odd=new ArrayList<>();

        int sumOfEvenElements=0;
        int sumOfOddElements=0;
        for (int i = 0; i < arry.length; i++) {

            if (arry[i]%2==0){
                even.add(arry[i]);
            }
            else {
                odd.add(arry[i]);
            }
        }

        System.out.println("even Numbers :");
        for (int evenNums :even){
            System.out.println(evenNums+" ");
            sumOfEvenElements+=evenNums;
        }




        System.out.println("Odd Numbers :");
        for (int oddNumbers:odd){
            System.out.println(oddNumbers+" ");
            sumOfOddElements+=oddNumbers;
        }
        System.out.println("Number of Odd Numbers in Array  :"+odd.size());
        System.out.println("Number of Even Numbers in Array  :"+even.size());

        System.out.println("Sum Of All  Even Numbers in Array  :"+sumOfEvenElements);
        System.out.println("Sum Of All  Odd Numbers in Array  :"+sumOfOddElements);
    }
}
