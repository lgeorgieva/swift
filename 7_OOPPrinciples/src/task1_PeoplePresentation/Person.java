package task1_PeoplePresentation;

/**
 * Created by ASUS on 6.11.2016 г..
 */
public  class Person {
    protected String firstName;
     protected   String lastName;


    public Person(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.length()<2 || firstName.length()>30){
            throw new IllegalArgumentException("Expected length for <parameter> is between 2 and 30 symbols.");
        }
        this.firstName=firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(firstName.length()<2 || firstName.length()>30){
            throw new IllegalArgumentException("Expected length for <parameter> is between 2 and 30 symbols.");
        }
        this.lastName = lastName;
    }
}
