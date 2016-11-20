package task1_PeoplePresentation;

/**
 * Created by ASUS on 6.11.2016 г..
 */
public class Student extends Person {

    private String facultyNumber;
    private int lectureCount;
    private int exerciseCount;
    private double hoursPerDay;

    public Student(String firstName, String lastName, String facultyNumber, int lectureCount, int exerciseCount) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
        this.setLectureCount(lectureCount);
        this.setExerciseCount(exerciseCount);
        calculateHoursPerDay();
    }


    // public Student(String firstName, String lastName, String facultyNumber, double hoursPerDay) {
    //     super();
    //  }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) {
        if (facultyNumber.length() < 5 || facultyNumber.length() > 10) {
            throw new IllegalArgumentException("Expected length for faculty number is between 5 and 10 symbols.");
        }
        this.facultyNumber = facultyNumber;
    }

    public int getLectureCount() {
        return lectureCount;
    }

    public void setLectureCount(int lectureCount) {
        if (lectureCount <= 0) {
            throw new IllegalArgumentException("Expected positive number for <parameter>.");
        }
        this.lectureCount = lectureCount;
    }

    public int getExerciseCount() {
        return exerciseCount;
    }

    public void setExerciseCount(int exerciseCount) {
        if (exerciseCount <= 0) {
            throw new IllegalArgumentException("Expected positive number for <parameter>.");
        }
        this.exerciseCount = exerciseCount;
    }

    private void calculateHoursPerDay() {


        this.hoursPerDay = ((this.lectureCount * 2) + (1.5 * this.exerciseCount)) / 5;
    }


    @Override
    public String toString() {
        return String.format("First name: %s%nLast name: %s%nOccupation: Student%nFaculty number: %s%nHours per day: %.2f%n"
                , this.firstName, this.lastName, this.facultyNumber, this.hoursPerDay);
    }
}
