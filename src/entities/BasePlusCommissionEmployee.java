package entities;

import java.util.Objects;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private float baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, int id, float grossSales, int commision, float baseSalary) {
        super(firstName, lastName, id, grossSales, commision);
        setBaseSalary(baseSalary);
    }

    public BasePlusCommissionEmployee() {
        super();
        this.baseSalary = 0;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        if(baseSalary < 0)
            throw new IllegalArgumentException("Cannot use negative salary");
        this.baseSalary = baseSalary;
    }

    @Override
    public float earnings() {
        return this.baseSalary + super.earnings();
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                super.toString() +
                "baseSalary=" + baseSalary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BasePlusCommissionEmployee that)) return false;
        if (!super.equals(o)) return false;
        return Float.compare(that.baseSalary, baseSalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), baseSalary);
    }


}