package task1_PeoplePresentation;

/**
 * Created by ASUS on 6.11.2016 г..
 */
public class Worker extends Person {

    private double weekSalary;
    private double workHoursPerDay;
    private double salaryPerHour;

    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDay(workHoursPerDay);
        calculateSalaryPerHour();
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        if (weekSalary <= 0) {
            throw new IllegalArgumentException("Expected positive number for <parameter>.");
        }
        this.weekSalary = weekSalary;
    }

    public double getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    public void setWorkHoursPerDay(double workHoursPerDay) {
        if (workHoursPerDay <= 0) {
            throw new IllegalArgumentException("Expected positive number for <parameter>.");
        }
        this.workHoursPerDay = workHoursPerDay;
    }

    private void calculateSalaryPerHour() {

        this.salaryPerHour = (this.weekSalary / 5) / this.workHoursPerDay;
    }

    @Override
    public String toString() {
        return String.format("First Name: %s%nLast Name: %s%nOccupation: Worker%nWeek Salary: %.2f%nHours per day: %.2f%nSalary per hour: %.2f%n"
                , this.firstName, this.lastName, this.weekSalary,this.workHoursPerDay, this.salaryPerHour);
    }
}
