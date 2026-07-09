package application;

import entities.EmployeePercentege;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramListas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.print("How many employees will be registered? ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<EmployeePercentege> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = scanner.nextInt();
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            Double salary = scanner.nextDouble();
            list.add(new EmployeePercentege(id, name, salary));

            
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int idsalary = scanner.nextInt();
        EmployeePercentege employee = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
        if (employee == null) {
            System.out.println("This employee does not exist!");
        }
        else {
            System.out.println("Enter the percentage:");
            double percentage = scanner.nextDouble();
            employee.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (EmployeePercentege x : list) {
            System.out.println(x);
        }

        scanner.close();

    }
    public static Integer position(List<EmployeePercentege> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<EmployeePercentege> list, int id) {
        EmployeePercentege emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}

