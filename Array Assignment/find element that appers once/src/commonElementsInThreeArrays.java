public class commonElementsInThreeArrays {
    public static void main(String[] args) {

        int []arry1={1,2,3,4,5,6,7,5};
        int []arry2={1,2,3,0,9,8,9,4};
        int []arry3={1,2,3,4};

        for (int i = 0; i <arry1.length ; i++) {
            for (int j = 0; j < arry2.length; j++) {
                for (int k = 0; k < arry3.length; k++) {
                    if (arry1[i]==arry2[j] && arry2[j]==arry3[k]){
                        System.out.println(arry1[i]);
                    }
                }
            }
        }
    }
}
