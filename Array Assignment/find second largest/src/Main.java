//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int arry[]={10,21,11,6,29,3};

        int temp;
        for (int i = 0; i <arry.length; i++) {
            for (int j=i+1;j<arry.length;j++){
                if (arry[i]<arry[j]){
                    temp=arry[i];
                    arry[i]=arry[j];
                    arry[j]=temp;

                }

            }
        }
      System.out.println(arry[1]);
    }
}