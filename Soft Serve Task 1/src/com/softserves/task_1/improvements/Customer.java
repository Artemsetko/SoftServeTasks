package com.softserves.task_1.improvements;

public class Customer {

    private String name;
    private int kindOfRent;
    private int daysForRent;

    public int getKindOfRent() {
        return kindOfRent;
    }

    public void setKindOfRent(int kindOfRent) {
        this.kindOfRent = kindOfRent;
    }

    public int getDaysForRent() {
        return daysForRent;
    }

    public void setDaysForRent(int daysForRent) {
        this.daysForRent = daysForRent;
    }

    // Other fields, constructors, get, set, etc.
    //
    public Customer(String name, int daysForRent, int kindOfRent) {
        this.name=name;
        this.daysForRent = daysForRent;
        this.kindOfRent = kindOfRent;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }


}