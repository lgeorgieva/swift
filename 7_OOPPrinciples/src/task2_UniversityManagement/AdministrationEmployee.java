package task2_UniversityManagement;

import java.util.ArrayList;

/**
 * Created by ASUS on 10.11.2016 г..
 */
public class AdministrationEmployee extends Employee {
    public AdministrationEmployee(String name, String phoneNumber, double salaryPerHour) {
        super(name, phoneNumber, salaryPerHour);
    }
    private ArrayList<String> courses = new ArrayList<>();

    public AdministrationEmployee(String name, String phoneNumber, double salaryPerHour, ArrayList<String> courses) {
        super(name, phoneNumber, salaryPerHour);
        this.courses = courses;
    }
}
