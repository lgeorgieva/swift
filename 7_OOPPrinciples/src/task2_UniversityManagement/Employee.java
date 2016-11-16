package task2_UniversityManagement;

/**
 * Created by ASUS on 10.11.2016 г..
 */
public class Employee extends Person {
    public Employee(String name, String phoneNumber) {
        super(name, phoneNumber);
    }
    private double salaryPerHour;

    public Employee(String name, String phoneNumber, double salaryPerHour) {

        super(name, phoneNumber);
        this.salaryPerHour = salaryPerHour;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
}
