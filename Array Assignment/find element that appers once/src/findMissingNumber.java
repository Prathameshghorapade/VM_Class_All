public class findMissingNumber {
    public static void main(String[] args) {

        int []arry={1,2,3,4,6};

        int expectedElements=arry.length+1;

        int totalSum=expectedElements*(expectedElements+1)/2;

        int sum=0; int missingElement=0;

        for (int i = 0; i <arry.length ; i++) {
            sum+=arry[i];
        }

//        System.out.println(sum);
//        System.out.println(totalSum);

        missingElement=totalSum-sum;

        System.out.println(missingElement);

    }
}
