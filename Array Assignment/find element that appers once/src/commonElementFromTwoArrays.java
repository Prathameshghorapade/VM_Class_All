public class commonElementFromTwoArrays {

    public static void main(String[] args) {

        int arry1[]={1,3,4,5,6,7,8};
        int arry2[]={9,1,3,4,7,8,44};

        for (int i = 0; i <arry1.length; i++) {

            for (int j = 0; j <arry2.length ; j++) {

                if (arry1[i]==arry2[j]){
                    System.out.println(arry1[i]);
                }
            }
        }
    }
}
