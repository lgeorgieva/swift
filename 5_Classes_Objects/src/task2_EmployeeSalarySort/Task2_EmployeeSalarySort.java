package task2_EmployeeSalarySort;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by ASUS on 4.11.2016 г..
 */
public class Task2_EmployeeSalarySort {
    public static void main(String[] args)  {

        // BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        Scanner scn = new Scanner(System.in);
        TreeSet<Employee> employeesSalary = new TreeSet<>();

        //int n = Integer.parseInt(bfr.readLine());
        int n = scn.nextInt();
        scn.nextLine();

        for (int i = 0; i < n; i++) {
            String[] input = scn.nextLine().split(", ");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            Employee employee = null;
            if (input.length == 4) {
                employee = new Employee(name, salary, position, department);
            } else if (input.length == 5) {
                if (isNumber(input[4])) {
                    int age = Integer.parseInt(input[4]);
                    employee = new Employee(name, salary, position, department, age);
                } else {
                    String email = input[4];
                    employee = new Employee(name, salary, position, department, email);
                }
            } else {
                String email = input[5];
                int age = Integer.parseInt(input[4]);
                employee = new Employee(name, salary, position, department, age, email);
            }
            employeesSalary.add(employee);
        }
        int count = 0;
        for (Employee employee1 : employeesSalary) {
            if (count >= 3) {
                System.out.println();
            } else {
                count++;
                System.out.println(employee1);
            }

        }


    }

    private static boolean isNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
