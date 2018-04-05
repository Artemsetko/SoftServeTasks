package com.softserves.task_2.entities.factory;

import com.softserves.task_2.entities.employees.Employee;
import com.softserves.task_2.entities.employees.FullTimeEmployee;
import com.softserves.task_2.entities.employees.RentedEmployee;
import com.softserves.task_2.enums.TypesOfEmployees;

public class Factory {

    public Employee generateEmployee (TypesOfEmployees employees, String [] dataOfEmployee){

        Employee employee = null;

        switch (employees) {
            case FULL_TIME_EMPLOYEE:
                employee = new FullTimeEmployee(Integer.parseInt(dataOfEmployee [0]), dataOfEmployee[1],
                        Boolean.parseBoolean(dataOfEmployee [2]), Double.parseDouble(dataOfEmployee [3]));
                break;
            case RENTED_EMPLOYEE:
                employee = new RentedEmployee(Integer.parseInt(dataOfEmployee [0]), dataOfEmployee[1],
                        Boolean.parseBoolean(dataOfEmployee [2]), Double.parseDouble(dataOfEmployee [3]));
                break;
        }
        return employee;
    }
}