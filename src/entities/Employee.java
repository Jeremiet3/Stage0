package entities;

import java.util.Objects;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private int id;

    public Employee() {
        this("plony", "almony", 0);
    }
    public Employee(String firstName, String lastName, int id) {
        setFirstName(firstName);
        setLastName(lastName);
        setId(id);
    }
    /**
     * returns the employee's salary
     */
    public abstract float earnings();
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id < 0)
            throw new IllegalArgumentException("Invalid id - cannot send negative id");
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ",}";
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public String getLastName(){
        return lastName;
    }

}