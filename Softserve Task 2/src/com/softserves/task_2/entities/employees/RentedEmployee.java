package com.softserves.task_2.entities.employees;

public class RentedEmployee extends Employee {

    private double hourlyRate;

    public RentedEmployee(int id, String name, boolean isFixedPayment, double hourlyRate) {
        super(id, name, isFixedPayment);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

}
