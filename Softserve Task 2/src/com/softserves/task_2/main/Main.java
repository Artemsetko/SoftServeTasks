package com.softserves.task_2.main;

import com.softserves.task_2.entities.calculator.PaymentCalculator;
import com.softserves.task_2.entities.employees.Employee;
import com.softserves.task_2.entities.reader.Reader;
import com.softserves.task_2.entities.sorter.Sorter;
import com.softserves.task_2.entities.writer.Writer;

import java.util.List;

public class Main {

    // File's name
    final static String NAME_INPUT_FILE = "Input data.txt";
    final static String NAME_OUTPUT_FILE = "Output data.txt";
    // Path to folder with needs file
    final static String PATCH_TO_FOLDER = "\\home\\Softserve Task 2\\src\\com\\softserves\\task_2\\resources\\";
    // List for input data of employees
    private static List<Employee> employeeList;

    public static void main(String[] args) {

        Reader reader = new Reader();
        Sorter sorter = new Sorter();
        PaymentCalculator paymentCalculator = new PaymentCalculator();

        // Read and stored info about employees from input file
        employeeList = reader.readFile(PATCH_TO_FOLDER,NAME_INPUT_FILE); {

            // Calculate the average monthly salary for each employee
            for (Employee employee: employeeList) {
                employee.setAverageMonthlySalary(paymentCalculator.calculatePayment(employee));
            }

            // Sort the employees above by average monthly salary
            employeeList = sorter.sortAboveByAverageSalary(employeeList);

            //Constructor takes as parameters the list of employees
            Writer writer = new Writer(employeeList, PATCH_TO_FOLDER, NAME_OUTPUT_FILE);

            writer.printInfoAboutAllEmployees();
//        writer.printInfoFromFirstToFiveEmployee();
//        writer.printIdOfThreeLastEmployees();
//        writer.writeDataOfEmployeesToFile();

        }
    }
}