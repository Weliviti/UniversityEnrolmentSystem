import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private String name;
    private String surname;
    private LocalDate dob;
    private String ID;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public LocalDate getDob() {
        return this.dob;
    }

    public String getID() {
        return this.ID;
    }

    public String toString(){
        String var1000 = this.name;
        return var1000 + " " + this.surname + ", ID: " + this.ID + ", DOB: " + this.getStringDate() + ", ";
         }
    public String getStringDate() {
        if (this.dob == null) {
            return "N/A";
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String formattedDate = this.dob.format(formatter);
            return formattedDate;
        }
    }
}
