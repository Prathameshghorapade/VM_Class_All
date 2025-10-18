package TreeSetExample.StudentProject;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<Student> attendanceSheet = new TreeSet<>();

        int option = 0;
        int yesOrNo = ' ';

        do {

            System.out.println("Enter 1 : for Add Student");
            System.out.println("Enter 2 : for delete Student");
            System.out.println("Enter 3 : for see All Student");
            System.out.println("Enter 4 : All Student(Sorted By Name)");
            System.out.println("Enter 5 : All Student(Sorted By Marks)");
            System.out.println("Enter 6 : Exit ");

            System.out.println("Enter Option :");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    Student student = inputStudents();
                    attendanceSheet.add(student);
                    break;

                case 2:
                    System.out.println("Enter Roll Number To Delete Student");
                    int rollNumToDelete = scanner.nextInt();
                    deleteStudentByID(attendanceSheet, rollNumToDelete);
                    break;

                case 3:
                    displayAllStudents(attendanceSheet);

                    break;

                case 4:
                    TreeSet<Student> sortedByName = new TreeSet<>(new SortedByName());
                    sortedByName.addAll(attendanceSheet);
                    displayAllStudents(sortedByName);

                    break;

                case 5:
                    TreeSet<Student> sortedByMarks = new TreeSet<>(new SortedByMarks());
                    sortedByMarks.addAll(attendanceSheet);
                    displayAllStudents(sortedByMarks);
                    break;

                case 6:
                    System.out.println("Thank You");
                    System.exit(0);

            }

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter y to Continoue");
            yesOrNo = scanner.next().charAt(0);

        } while (yesOrNo == 'Y' || yesOrNo == 'y');
    }

    private static Student inputStudents() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Roll no :");
        int rolnum = scanner.nextInt();

        System.out.println("Enter Name :");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println("Enter Marks");
        double marks = scanner.nextDouble();

        Student student = new Student(rolnum, name, marks);

        return student;

    }

    private static void deleteStudentByID(TreeSet<Student> list, int rollNo) {

        boolean studentFound = false;

        Iterator<Student> itr = list.iterator();

        while (itr.hasNext()) {

            Student student = itr.next();

            if (student.getRollNo() == rollNo) {

                itr.remove();
                studentFound = true;
                System.out.println("Student Deleted Sucessfully");

            }
        }

        if (!studentFound) {
            System.out.println("Student Not Found");
        }
    }

    private static void displayAllStudents(TreeSet<Student> student) {

        if (student.isEmpty()) {
            System.out.println("Attendance Sheet is Empty");
        }

        System.out.println("RollNumber    Name    Marks");
        for (Student std : student) {

            System.out.println(" " + std.getRollNo() + "   ");
            System.out.println(" " + std.getName() + "   ");
            System.out.println(" " + std.getMarks() + "   ");

        }

    }

}
