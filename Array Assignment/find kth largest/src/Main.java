import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int k=4;

        int[]arry={32,43,21,22,23,24};

        for (int i = 0; i <arry.length ; i++) {
            for (int j =i+1; j <arry.length ; j++) {
                if (arry[i]<arry[j]){

                    int temp=arry[i];
                    arry[i]=arry[j];
                    arry[j]=temp;
                }
            }

            if (i==k-1){
                System.out.println("Kth Largest Element :"+arry[i]);
            }

        }

        System.out.println(Arrays.toString(arry));


    }


}