

public class Lecturer extends Person {
    private int officeNumber = 0;
    private String specialisation;

    public Lecturer(String name, String surname) {
        super(name, surname);
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public int getOfficeNumber() {
        return this.officeNumber;
    }

    public String getSpecialisation() {
        return this.specialisation;
    }

}