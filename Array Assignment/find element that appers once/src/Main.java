//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int arry[]={2,3,4,5,2,3,5,4,7};
        int res=0;

        for (int i = 0; i < arry.length; i++) {

            res=res^arry[i];
        }

        System.out.println(res);
    }
}