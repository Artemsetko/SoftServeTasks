package com.softserves.task_2.entities.writer;

import com.softserves.task_2.entities.employees.Employee;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Writer {

    List <Employee> employees;
    String pathToFile;
    String fileName;

    public Writer(List<Employee> employees, String pathToFile, String fileName){
        this.employees = employees;
        this.pathToFile = pathToFile;
        this.fileName = fileName;
    }


    public void writeDataOfEmployeesToFile () {
        File file = new File(pathToFile + fileName);
        try {
            // check whether a file exists
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                for (Employee employee : employees) {
                    out.print(getInfoAboutEmployee(employee) + System.getProperty("line.separator"));
                }
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //   Print to console information of all employees
    public void printInfoAboutAllEmployees (){
        for (Employee employee : employees) {
            System.out.println(getInfoAboutEmployee(employee));
        }
    }
    // print to console all information of employees from first to 5th employee from list of employees
    public void printInfoFromFirstToFiveEmployee (){
        int i = 0;
        for (Employee employee : employees) {
            i++;
            if (i == 6) break;
            System.out.println(getInfoAboutEmployee(employee));
        }
    }

    // print to console ID of three last employees from list of employees
    public void printIdOfThreeLastEmployees() {
        for (int i = employees.size() - 3; i < employees.size(); i++) {
            System.out.println(getIdOfEmployee(i));
        }
    }

    /**
     * Get all needs information from object "employee"
     * @param employee - object "employee"
     * @return - String with needs employee's information
     */
    private String getInfoAboutEmployee(Employee employee) {
        return  "ID - " + employee.getId() + ", name - " + employee.getName() +
                ", average salary - " + employee.getAverageMonthlySalary();
    }

    /**
     * Get ID needs information from object "employee"
     * @param i - number of employee in the list of employee
     * @return - String with needs employee's information
     */
    private String getIdOfEmployee(int i) {
        return  "ID - " + employees.get(i).getId();
    }
}