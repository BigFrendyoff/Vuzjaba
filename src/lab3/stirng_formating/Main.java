package lab3.stirng_formating;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("ABC", 3900));
        employees.add(new Employee("EFG", 8500));
        Report.generateReport(employees);
    }
}
