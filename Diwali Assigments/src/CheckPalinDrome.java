import java.util.LinkedList;
import java.util.Scanner;

public class CheckPalinDrome {

    public static boolean checkPalindromeOrNot(LinkedList<Character>list){

        LinkedList<Character>tempList=new LinkedList<>(list);

        while (tempList.size()>1){

            char firstChar=tempList.removeFirst();
            char lastChar=tempList.removeLast();

            if (firstChar!=lastChar){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        LinkedList<Character>list=new LinkedList<>();

        System.out.println("Enter Word");
        String input=scanner.nextLine();

        for (char eachCharacter:input.toCharArray()){
            if (eachCharacter!=' '){
                list.add(Character.toLowerCase(eachCharacter));
            }
        }

        boolean result=checkPalindromeOrNot(list);
        System.out.println(list);
        if (result){
            System.out.println("Palindrome");
        }else
            System.out.println("Not Palindrome");

    }
}
