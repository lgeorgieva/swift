package task1_PeoplePresentation;

import java.util.Scanner;

/**
 * Created by ASUS on 6.11.2016 г..
 */
public class Task1_PeoplePresentation {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String command = scn.nextLine();


        Student student = null;
        Worker worker = null;
        while (!(command.equals("END"))) {

            String input[] =command.split("\\s+");
            String studentFirstName = input[0];
            String studentLastName = input[1];
            String facultyNumber = input[2];
            int lectureCount = Integer.parseInt(input[3]);
            int exerciseCount = Integer.parseInt(input[4]);
            student = new Student(studentFirstName, studentLastName, facultyNumber, lectureCount, exerciseCount);

            input = command.split("\\s+");
            String workerFirstName = input[0];
            String workerLastName = input[1];
            double weekSalary = Double.parseDouble(input[2]);
            double workHoursPerDay = Double.parseDouble(input[3]);
            worker = new Worker(workerFirstName, workerLastName, weekSalary, workHoursPerDay);

            System.out.println(student);
            System.out.println(worker);
        }
    }

}


