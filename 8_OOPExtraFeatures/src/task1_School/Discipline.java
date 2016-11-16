package task1_School;

/**
 * Created by ASUS on 11.11.2016 г..
 */
public class Discipline {

    private String nameOfDiscipline;
    private int hoursPerWeek;

    public Discipline(String nameOfDiscipline, int hoursPerWeek) {
        this.nameOfDiscipline = nameOfDiscipline;
        this.hoursPerWeek = hoursPerWeek;
    }


    public String getNameOfDiscipline() {
        return nameOfDiscipline;
    }

    public void setNameOfDiscipline(String nameOfDiscipline) {
        this.nameOfDiscipline = nameOfDiscipline;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }
}
