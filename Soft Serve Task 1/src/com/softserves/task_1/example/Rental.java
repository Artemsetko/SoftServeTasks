package com.softserves.task_1.example;

public class Rental {

    private int kind;
    private int days;
    // Other fields, constructors, get, set, etc.
    //
    public Rental(int kind, int days) {
        this.kind=kind;
        this.days=days;
    }
    public int getKind() {
        return kind;
    }
    public void setKind(int kind) {
        this.kind=kind;
    }
    public int getDays() {
        return days;
    }
    public void setDays(int days) {
        this.days=days;
    }
    public double getBasePrice() {
        // Calculation of Price.
        // . . .
        return 5;
    }
    // Other methods.
}