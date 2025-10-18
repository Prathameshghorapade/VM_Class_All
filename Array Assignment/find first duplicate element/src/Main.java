//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int []arry={6,4,3,2,43,2,3};

        int temp=0;
        for (int i = 0; i <arry.length ; i++)
        {
            for (int j = i+1; j < arry.length; j++)
            {

                if (arry[i]==arry[j]){
                    System.out.println(arry[i]);
                    temp=temp+1;
                    break;
                }

            }
            if (temp>0){
                break;
            }

        }


    }
}