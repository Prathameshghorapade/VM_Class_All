
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class MergeUnsortedTwoLists {


    public static LinkedList<Integer>mergedTwoLists(LinkedList<Integer>list1,LinkedList<Integer>list2){

        LinkedList<Integer>mergedList=new LinkedList<>();

        LinkedList<Integer>temp1=new LinkedList<>(list1);
        LinkedList<Integer>temp2=new LinkedList<>(list2);

        while (!temp1.isEmpty()&& !temp2.isEmpty()){

            if (temp1.getFirst()<=temp2.getFirst()){

                mergedList.add(temp1.removeFirst());

            }else {
                mergedList.add(temp2.removeFirst());
            }
        }

        mergedList.addAll(temp1);
        mergedList.addAll(temp2);

        return mergedList;
    }




    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        LinkedList<Integer>list1=new LinkedList<>();
        LinkedList<Integer>list2=new LinkedList<>();


        System.out.println("Enter Size Of First List :");
        int sizeofFirstList=scanner.nextInt();

        System.out.println("Enter"+sizeofFirstList +"elements");
        for (int i=0;i<sizeofFirstList;i++){
            list1.add(scanner.nextInt());
        }



        System.out.println("Enter Size Of Second List :");
        int sizeofSecondList=scanner.nextInt();

        System.out.println("Enter"+sizeofSecondList +"elements");
        for (int i=0;i<sizeofSecondList;i++){
            list2.add(scanner.nextInt());
        }

        Collections.sort(list1);
        Collections.sort(list2);


        LinkedList<Integer>mergedList=mergedTwoLists(list1,list2);

        System.out.println("First List :"+list1);

        System.out.println("Second List :"+list2);

        System.out.println("Merged List :"+mergedList);






    }
}
