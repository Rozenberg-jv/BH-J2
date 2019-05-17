package by.belhard.j2.lesson11.les;

public class Specialty {

    private int id;
    private String specialty;

    public Specialty(int id, String specialty) {
        this.id = id;
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
