package com.softserves.task_2.entities.employees;

public class Employee {

    private String name;
    private int id;
    private double averageMonthlySalary;
    private boolean isFixedPayment;

    public Employee(int id, String name, boolean isFixedPayment) {
        this.name = name;
        this.isFixedPayment = isFixedPayment;
        this.id = id;
    }

    public boolean isFixedPayment() {
        return isFixedPayment;
    }

    public void setFixedPayment(boolean isFixedPayment) {
        this.isFixedPayment = isFixedPayment;
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

    public double getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    public void setAverageMonthlySalary(double averageMonthlySalary) {
        this.averageMonthlySalary = averageMonthlySalary;
    }

}