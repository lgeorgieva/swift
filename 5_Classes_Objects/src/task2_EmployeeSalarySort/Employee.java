package task2_EmployeeSalarySort;

/**
 * Created by ASUS on 4.11.2016 г..
 */
public class Employee implements Comparable<Employee> {

    private String name;

    private double salary;

    private String position;

    private String department;

    private int age;

    private String email;

    public Employee(String name, double salary, String position, String department, int age, String email) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = age;
        this.email = email;
    }

    public Employee(String name, double salary, String position, String department) {
        this(name, salary, position, department, -1, "no email");
    }

    public Employee(String name, double salary, String position, String department, int age) {
        this(name, salary, position, department, age, "no email");
    }

    public Employee(String name, double salary, String position, String department, String email) {
        this(name, salary, position, department, -1, email);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s", this.name, this.department, this.position, this.email);
    }


    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee employee) {
        return Double.compare(employee.salary, this.salary);
    }
}
