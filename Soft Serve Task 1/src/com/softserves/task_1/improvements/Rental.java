package com.softserves.task_1.improvements;

/**
 *  Method amountFor moved to class Rental.
 *
 *  For moved changed parameter of this method. At now parameter is Customer.
 *  Object Customer has next fields: name, daysForRant, kindOfRent
 *  Based on the values of Customer's fields, we can calculate amount for rent.
 *
 *  For improve code quality construction "if-else" changed to construction "switch-case"
 */

public class Rental {

    private double amountFor(Customer customer) {

        double result;
        // Another code.
        result = customer.getDaysForRent() * getBasePrice(customer);

        if (customer.getDaysForRent() > 7) {
            result = result*3;
        } else {
            switch (customer.getKindOfRent()) {
                case 1:
                    result = result*1.5;
                    break;
                case 2:
                    result = result*2;
                    break;
                case 3:
                    result = result*2.5;
                    break;
            }
        }
        // Other calculation.
        return result;
    }

    private double getBasePrice(Customer customer) {
        // Calculation of Price.
        // . . .
        return 5;
    }
}