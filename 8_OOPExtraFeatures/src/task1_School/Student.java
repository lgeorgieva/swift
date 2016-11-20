package task1_School;

/**
 * Created by ASUS on 11.11.2016 г..
 */
public class Student extends Teacher {


    private int studentNumber;

    public Student(String name, String nameOfDiscipline, int hoursPerWeek,int studentNumber) {
        super(name, nameOfDiscipline, hoursPerWeek);
        this.setStudentNumber(studentNumber);
    }



    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}

