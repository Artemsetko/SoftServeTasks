package com.softserves.task_2.entities.sorter;

import com.softserves.task_2.entities.employees.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sorter of the collection of employees in descending order by the average monthly salary.
 * In the case of equal salary – by the name.
 */
public class Sorter {

    /**
     * For sorting list of employees used the Java's inside collection's sort with comparator
     *
     * @param employees - list of employees.
     * @return - sorted list of employees.
     */
    public List<Employee> sortAboveByAverageSalary(List<Employee> employees) {
        Collections.sort(employees, new ComparatorByIncreasingAverageSalary());
        Collections.sort(employees, new ComparatorByNameForTheSameAverageSalary());
        System.out.println("sorted by increase average monthly salary successfully");
        return employees;
    }

    // comparator for sort the employees by increasing average monthly salary
    private class ComparatorByIncreasingAverageSalary implements Comparator<Employee> {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            return employee1.getAverageMonthlySalary() < employee2.getAverageMonthlySalary() ? -1:
                    employee1.getAverageMonthlySalary() == employee2.getAverageMonthlySalary() ? 0 : 1;
        }
    }

    // if average monthly salary of employees is duplicated used next comparator for sort by name
    private class ComparatorByNameForTheSameAverageSalary implements Comparator<Employee> {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            return employee1.getAverageMonthlySalary() == employee2.getAverageMonthlySalary() &&
                    employee1.getName().compareTo(employee2.getName()) < 1 ? -1 : 0;
        }
    }

}