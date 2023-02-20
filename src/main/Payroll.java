package main;

import entities.BasePlusCommissionEmployee;
import entities.CommissionEmployee;
import entities.Employee;
import entities.HourlyEmployee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Payroll {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0]=new HourlyEmployee(45.8f,60);
        employees[1] = new CommissionEmployee("David","Growe",123,2598,15);
        employees[2] = new BasePlusCommissionEmployee("Itshak","Adams",543,1978,20,7912);

        for(Employee item : employees)
        {
            System.out.println(item);
            if(item instanceof BasePlusCommissionEmployee)
                ((BasePlusCommissionEmployee)item).setBaseSalary(1.1f*((BasePlusCommissionEmployee) item).getBaseSalary());
        }

        for(Employee item : employees)
        {
            System.out.println(item);
        }


    }
}
