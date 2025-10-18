import java.util.Arrays;

public class RemoveDuplicateElement {
    public static void main(String[] args) {

        int []arry={20,2,3,45,6,5,5,43};

        for (int i = 0; i <arry.length ; i++) {
            for (int j = i; j <arry.length-1 ; j++) {
                if (arry[i]==arry[j]){
                    arry[i]=arry[i+1];
                }
                break;
            }
        }
        System.out.println(Arrays.toString(arry));
    }
}
