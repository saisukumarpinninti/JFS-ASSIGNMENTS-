import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Employee {
    Scanner sc = new Scanner(System.in);
    public String id;
    public String name;
    public long salary;
    public String department;

    public Employee() {
        this.id = getId();
        this.name = getName();
        this.salary = getSalary();
        this.department = getDepartment();
    }

    //get id of employee
    public String getId() {
        System.out.println("Enter employee id ");
        String id = sc.next();
        return id;
    }

    //get name of employee
    public String getName() {
        System.out.println("Enter employee name");
        String name = sc.next();
        return name;
    }

    //get salary of employee
    public long getSalary() {
        System.out.println("Enter employee salary ");
        long salary = sc.nextLong();
        return salary;
    }

    // get department
    public String getDepartment() {
        System.out.println("Enter employee department ");
        String department = sc.next();
        return department;
    }

    public static void displayDetails(Employee employee) {
        {
            System.out.println(employee.id);
            System.out.println(employee.name);
            System.out.println(employee.salary);
            System.out.println(employee.department);
        }
    }
}
public class Q1 {
    public static void main(String[] args) {
        Set<Employee> employees1 = new HashSet<>();
        employees1.add(new Employee());
        employees1.add(new Employee());
        employees1.add(new Employee());
        for( Employee employee : employees1 ){
            Employee.displayDetails(employee);
        }

    }
}