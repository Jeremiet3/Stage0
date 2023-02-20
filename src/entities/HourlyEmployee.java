package entities;

public class HourlyEmployee extends Employee {
    private float wage;

    private int hours;


    public HourlyEmployee(String firstName, String lastName, int id, float wage, int hours) {
        super(firstName, lastName, id);
        setWage(wage);
        setHours(hours);
    }

    public HourlyEmployee(float wage, int hours) {
        setWage(wage);
        setHours(hours);
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                super.toString() +
                "wage=" + wage +
                ", hours=" + hours +
                '}';
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        if(wage<=0)
            throw new IllegalArgumentException("Negative Wage");
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours<=0)
            throw new IllegalArgumentException("Negative Hours");
        this.hours = hours;
    }

    @Override
    public float earnings() {
        return wage*hours;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
