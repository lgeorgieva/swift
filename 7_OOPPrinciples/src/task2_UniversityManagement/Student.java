package task2_UniversityManagement;

import java.util.ArrayList;

/**
 * Created by ASUS on 10.11.2016 г..
 */
public class Student extends Person {
    public Student(String name, String phoneNumber) {
        super(name, phoneNumber);
    }
    private String facultyNumber;
    private ArrayList<String> courses = new ArrayList<>();

    public Student(String name, String phoneNumber, String facultyNumber, ArrayList<String> courses) {
        super(name, phoneNumber);
        this.facultyNumber = facultyNumber;
        this.courses = courses;
    }
}

