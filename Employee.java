package oops_class;
import java.util.*;
public class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[]args){
        System.out.println("This is the class:");
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        emp.name = "Arnav";
        emp.salary = 34000;
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        System.out.println("Enter a name:");
        String name= sc.next();
        emp.setName(name);
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
    }
}
