package task1_School;

/**
 * Created by ASUS on 11.11.2016 г..
 */
public class Teacher extends Discipline {


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher(String name, String nameOfDiscipline, int hoursPerWeek) {
        super(nameOfDiscipline, hoursPerWeek);
        this.setName(name);
    }
}








