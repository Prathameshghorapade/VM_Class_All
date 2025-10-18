import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        TreeSet var2 = new TreeSet();
        int var3 = 0;
        char var4 = ' ';

        do {
            System.out.println("Enter 1 : for Add Student");
            System.out.println("Enter 2 : for delete Student");
            System.out.println("Enter 3 : for see All Student");
            System.out.println("Enter 4 : All Student(Sorted By Name)");
            System.out.println("Enter 5 : All Student(Sorted By Marks)");
            System.out.println("Enter 6 : Exit ");
            System.out.println("Enter Option :");
            var3 = var1.nextInt();
            switch (var3) {
                case 1:
                    Student var5 = inputStudents();
                    var2.add(var5);
                    break;
                case 2:
                    System.out.println("Enter Roll Number To Delete Student");
                    int var6 = var1.nextInt();
                    deleteStudentByID(var2, var6);
                    break;
                case 3:
                    displayAllStudents(var2);
                    break;
                case 4:
                    TreeSet var7 = new TreeSet(new SortedByNames());
                    var7.addAll(var2);
                    displayAllStudents(var7);
                    break;
                case 5:
                    TreeSet var8 = new TreeSet(new SortedByMarks());
                    var8.addAll(var2);
                    displayAllStudents(var8);
                    break;
                case 6:
                    System.out.println("Thank You");
                    System.exit(0);
            }

            new Scanner(System.in);
            System.out.println("Enter y to Continoue");
            var4 = var1.next().charAt(0);
        } while(var4 == 'Y' || var4 == 'y');

    }

    private static Student inputStudents()  throws RuntimeException{

        Scanner var0 = new Scanner(System.in);
        System.out.println("Enter Roll no :");
        int var1 = var0.nextInt();
        System.out.println("Enter Name :");
        var0.nextLine();
        String var2 = var0.nextLine();
        System.out.println("Enter Marks");
        double var3 = var0.nextDouble();
        Student var5 = new Student(var1, var2, var3);
            return var5;


    }

    private static void deleteStudentByID(TreeSet<Student> var0, int var1) {
        boolean var2 = false;
        Iterator var3 = var0.iterator();

        while(var3.hasNext()) {
            Student var4 = (Student)var3.next();
            if (var4.getRollno() == var1) {
                var3.remove();
                var2 = true;
                System.out.println("Student Deleted Sucessfully");
            }
        }

        if (!var2) {
            System.out.println("Student Not Found");
        }

    }

    private static void displayAllStudents(TreeSet<Student> var0) {
        if (var0.isEmpty()) {
            System.out.println("Attendance Sheet is Empty");
        }

        System.out.println("RollNumber    Name    Marks");

        for(Student var2 : var0) {
            System.out.print(" " + var2.getRollno() + "   ");
            System.out.print(" " + var2.getName() + "   ");
            System.out.println(" " + var2.getMarks() + "   ");
        }

    }
}
