import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList<Employee> office = new LinkedList<>();

        int option = 0;
        int yesOrNo = ' ';

        do {

            System.out.println("Enter 1 : for Add Employee");
            System.out.println("Enter 2 : for delete Employee");
            System.out.println("Enter 3 : for see All Employee");
            System.out.println("Enter 4 : Exit");

            System.out.println("Enter Option :");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    Employee employee = inputEmployee();
                    office.add(employee);
                    break;

                case 2:
                    System.out.println("Enter Employee ID");
                    int deleteId = scanner.nextInt();
                    deleteEmp(office, deleteId);
                    break;

                case 3:
                    printAllEmp(office);
                    break;

                case 4:
                    System.out.println("Thank You");
                    System.exit(0);

            }

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter y to Continoue");
            yesOrNo = scanner.next().charAt(0);

        } while (yesOrNo == 'Y' || yesOrNo == 'y');
    }

    private static Employee inputEmployee() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Id:");
        int id = scanner.nextInt();

        System.out.println("Enter Name :");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println("Enter Salary");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(id, name, salary);

        return employee;

    }

    private static void printAllEmp(LinkedList<Employee> list) {

        if (list.isEmpty()) {
            System.out.println("Office List is Empty....Plz Add Employee and Try Again");
            return;
        }

        System.out.println(" ID   Name   Salary");

        for (Employee emp : list) {

            System.out.print(" " + emp.getId() + "   ");
            System.out.print(" " + emp.getName() + "   ");
            System.out.println(" " + emp.getSalary() + "   ");
        }

    }

    private static void deleteEmp(LinkedList<Employee> list, int id) {
        boolean empFound = false;
        Iterator<Employee> itr = list.iterator();

        while (itr.hasNext()) {

            Employee emp = itr.next();

            if (emp.getId() == id) {
                itr.remove();
                empFound = true;
                System.out.println("Emp Delete Successfully");
            }
        }

        if (!empFound) {
            System.out.println("Emp Not Found");
        }

    }
}