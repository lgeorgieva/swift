package task3_FileManagement;

import java.util.Date;

/**
 * Created by ASUS on 10.11.2016 г..
 */
public class File {
    protected String name;
    protected String location;
    protected Date creationDate;
    protected String newLocation;

    boolean isDeleted() {
        return false;
    }


   public String move() {
        return this.newLocation;
    }
    String copy() {
return this.getNewLocation(newLocation);
    }



    boolean delete() {

return true;
    }
    void execute() {

    }
    void info() {

    }

    public File(String name, String location, Date creationDate) {
        this.setName(name);
        this.setLocation(location);
        this.setCreationDate(creationDate);
        move();
        copy();
        delete();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNewLocation(String newLocation) {
        this.newLocation = newLocation;
        return this.newLocation;
    }
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
