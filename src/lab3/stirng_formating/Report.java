package lab3.stirng_formating;

import java.util.ArrayList;

public class Report {
    public static void generateReport(ArrayList<Employee> employees){
        for (Employee employee: employees) {
            System.out.println(employee.toString());
        }
    }
}
