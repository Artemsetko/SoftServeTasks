package com.softserves.task_2.entities.calculator;

import com.softserves.task_2.entities.employees.Employee;
import com.softserves.task_2.entities.employees.FullTimeEmployee;
import com.softserves.task_2.entities.employees.RentedEmployee;

public class PaymentCalculator {

    /**
     * For employees with hourly wage (rented employees) use next formula: “average monthly salary = 20.8*8* hourly rate”,
     * for employees with fixed payment (full-time employees) – “average monthly salary = fixed monthly payment”
     *
     * @param employee
     * @return - amount of salary
     */
    public double calculatePayment(Employee employee){
        //check instance of employee
        if (employee.isFixedPayment()) {
            // For get the amount of fixed payment of the full-time employee used down casting.
            return ((FullTimeEmployee)employee).getFixedPayment();
            // For get the amount of hourly rate of the rented employee used down casting too.
        } else return 20.8 * 8 * ((RentedEmployee)employee).getHourlyRate();
    }

}