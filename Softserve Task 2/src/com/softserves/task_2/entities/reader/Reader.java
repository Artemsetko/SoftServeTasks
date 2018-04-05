package com.softserves.task_2.entities.reader;

import com.softserves.task_2.entities.factory.Factory;
import com.softserves.task_2.entities.employees.Employee;
import com.softserves.task_2.enums.TypesOfEmployees;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Reader {

    public Factory factory = new Factory();

    public List<Employee> readFile (String pathToFile, String fileName) {

        List<Employee> employeesData = new LinkedList<Employee>();
        String line;
        String [] employeeData;

        try  {
            BufferedReader br = new BufferedReader(new FileReader(pathToFile + fileName));
            while ((line = br.readLine()) != null) {

                // Split the line on the parts with data, and stored this data to array
                employeeData = line.split(" ");

                // if the employee has fixed payment then create the object of FULL_TIME_EMPLOYEE,
                // else create the object of RENTED_EMPLOYEE
                if (Boolean.parseBoolean(employeeData[2])){
                    employeesData.add(factory.generateEmployee(TypesOfEmployees.FULL_TIME_EMPLOYEE, employeeData));
                } else employeesData.add(factory.generateEmployee(TypesOfEmployees.RENTED_EMPLOYEE, employeeData));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("error");
        }
        return employeesData;
    }

}