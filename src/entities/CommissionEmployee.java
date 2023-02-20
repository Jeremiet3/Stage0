package entities;

import java.util.Objects;

public class CommissionEmployee extends Employee{
    private float grossSales; //can be negative
    private int commision;

    public CommissionEmployee(String firstName, String lastName, int id, float grossSales, int commision) {
        super(firstName, lastName, id);
        this.grossSales = grossSales;
        setCommision(commision);
    }

    public CommissionEmployee() {
        super();
        this.grossSales = 0;
        this.commision = 0;
    }

    public float getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(float grossSales) {
        this.grossSales = grossSales;
    }

    public int getCommision() {
        return commision;
    }

    public void setCommision(int commision) {
        if(commision < 0)
            throw new IllegalArgumentException("Cannot get negative commision");
        this.commision = commision;
    }


    @Override
    public String toString() {
        return  "CommissionEmployee{" +
                super.toString() +
                "grossSales=" + grossSales +
                ", commision=" + commision +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommissionEmployee that)) return false;
        if (!super.equals(o)) return false;
        return Float.compare(that.grossSales, grossSales) == 0 && commision == that.commision;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), grossSales, commision);
    }

    @Override
    public float earnings(){
        return (this.commision / 100) * this.grossSales;
    }
}