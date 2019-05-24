package by.belhard.j2.lesson11.les;

import java.util.Date;

public class Employee {

    private int id;

    private String name;
    private Specialty specialty;
    private int salary;
    private Date dateOfEmployment;

    public Employee(int id, String name, Specialty specialty, int salary, Date dateOfEmployment) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.salary = salary;
        this.dateOfEmployment = dateOfEmployment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(Date dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    @Override
    public String toString() {
        return String.format("%-2d) %-10s %-10s %5d  %5$td/%5$tm/%5$tY\n",
                id, name, specialty.getSpecialty(), salary, dateOfEmployment);
    }
}
