package task1_School;

/**
 * Created by ASUS on 11.11.2016 г..
 */
public  class Class extends Student{
   private String nameOfClass;


    public Class(String name, String nameOfDiscipline, int hoursPerWeek, int studentNumber,String nameOfClass) {
        super(name, nameOfDiscipline, hoursPerWeek, studentNumber);
        this.setNameOfClass(nameOfClass);
    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    public void setNameOfClass(String nameOfClass) {
        this.nameOfClass = nameOfClass;
    }
}
