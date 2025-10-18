package LikedListExamples.ProjectStudent.src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> jpa81 = new ArrayList<>();

        int option = 0;

        char yesOrNo = ' ';

        do {
            System.out.println("*****  STUDENT INFO   ****** ");

            System.out.println(" 1 : ADD ");
            System.out.println(" 2 : DELETE ");
            System.out.println(" 3 : CHECK ");
            System.out.println(" 4 : SHOW ALL ");
            System.out.println(" 5 : Exit ");
            System.out.println("---------------------------------");
            System.out.println("Enter Option ");

            option = scanner.nextInt();

            switch (option) {

                case 1:
                    Student student = addStudents();
                    jpa81.add(student);
                    System.out.println("Student added Successfully !!");
                    break;

                case 2:
                    System.out.println("Enter Student Info To Find Student :");
                    Student deleteStudent = addStudents();

                    if (jpa81.remove(deleteStudent)) {
                        System.out.println("Student Deleted Successfully");
                    } else
                        System.out.println("Student Not Exist or Found");
                    displayAllStudents(jpa81);
                    break;

                case 3:
                    System.out.println("Enter Student Info to Find Student:");
                    Student findStudent = addStudents();
                    if (jpa81.contains(findStudent)) {
                        System.out.println("Student found Successfully :");
                    } else
                        System.out.println("Student Doesnt Exists !!");
                    break;

                case 4:
                    displayAllStudents(jpa81);
                    break;

                case 5:
                    System.out.println("Thank YOUUU !!!");
                    System.exit(0);
            }

            System.out.println("For Continue Press Y or y");
            yesOrNo = scanner.next().charAt(0);

        } while (yesOrNo == 'Y' || yesOrNo == 'y');

    }

    public static Student addStudents() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Id :");
        int id = scanner.nextInt();

        System.out.println("Enter Name :");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println("Enter Marks :");
        double marks = scanner.nextDouble();

        Student student = new Student(id, name, marks);

        return student;
    }

    private static void displayAllStudents(ArrayList<Student> jpa81) {

        Iterator<Student> studentIterator = jpa81.iterator();

        System.out.println("  ID    NAME    MARKS   ");
        System.out.println("___________________________");

        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            System.out.print("  " + student.getId() + "  ");
            System.out.print("  " + student.getName() + "  ");
            System.out.println("  " + student.getMarks() + "  ");
            System.out.println("___________________________");
        }

    }

}