import java.util.Arrays;

public class DeleteElementInArray {
    public static void main(String[] args) {

        int arry[]={1,2,3,4,20,445,65,43,33};
        int deleteElement=20;


        for (int i = 0; i <arry.length ; i++) {
            if (arry[i]==deleteElement){

                for (int j =i; j <arry.length-1; j++) {
                    arry[j]=arry[j+1];
                }
                break;
            }
        }
        System.out.println(Arrays.toString(arry));
    }
}
