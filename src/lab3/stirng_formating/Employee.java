package lab3.stirng_formating;

import java.util.Formatter;

public class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString(){
        Formatter formatter = new Formatter();
        formatter.format("%6d", Double.valueOf(salary).intValue());
        System.out.println(salary);
        return String.valueOf(salary);
    }
}
