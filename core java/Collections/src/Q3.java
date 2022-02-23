import javax.lang.model.element.Element;
import java.util.*;



class Employee implements Comparable<Object> {
    Scanner sc = new Scanner(System.in);
    public String id;
    public String name;
    public long salary;
    public String department;

    public Employee(String id, String name, long salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    //get id of employee
    public String getId() {
        this.id=id;
        return id;
    }

    //get name of employee
    public String getName() {
        this.name = name;
        return name;
    }

    //get salary of employee
    public long getSalary() {
        this.salary = salary;
        return salary;
    }

    // get department
    public String getDepartment() {
        this.salary = salary;
        return department;
    }

    public String toString(){
        return "Employee [Id="+getId()+",name ="+getName()+",Department="+getDepartment()+",Salary"+getSalary()+"]";
    }
    @Override
    public int compareTo(Object o) {
        return 1;
    }

}

class idComparator implements Comparator<Employee>
{
    @Override
    public int compare(Employee s1, Employee s2)
    {
        return s1.getName().compareTo(s2.getName());
    }
}
class nameComparator implements Comparator<Employee>
{
    @Override
    public int compare(Employee s1, Employee s2)
    {
        return s1.getName().compareTo(s2.getName());
    }
}
class DepartmentComparator implements Comparator<Employee>
{
    @Override
    public int compare(Employee s1, Employee s2)
    {
        return s1.getDepartment().compareTo(s2.getDepartment());
    }
}
class SalaryComparator implements Comparator<Employee>
{
    @Override
    public int compare(Employee s1, Employee s2)
    {
        return (int) (s1.getSalary()-(s2.getSalary()));
    }
}

public class Q3 {
    public static void main(String[] args) {
        Employee emp0 = new Employee("100", "shyam", 88000l, "mechanical");
        Employee emp1 = new Employee("101", "sukumar", 80000l, "Cse");
        Employee emp2 = new Employee("102", "ganesh", 40000l, "electrical");
        System.out.println("enter Your Option : "+"\n"+" \" 1 .\" for Sort by name "+"\n"+" \" 2 .\" for Sort by Id "+"\n"+" \" 3 .\" for Sort by Salary "+"\n"+" \" 4 .\" for Sort by Department ");
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        switch (o) {
            case 1:
                Set <Employee> ns = new TreeSet<Employee>(new nameComparator());
                ns.add(emp0);
                ns.add(emp1);
                ns.add(emp2);
                System.out.println("name in Sorted manner");
                for(Employee e: ns ){
                    System.out.println(e);
                }
                break;
            case 2:
                System.out.println("Id in sorted manner");
                Set <Employee> Ids = new TreeSet<Employee>(new idComparator());
                Ids.add(emp0);
                Ids.add(emp1);
                Ids.add(emp2);
                for(Employee e: Ids ){
                    System.out.println(e);
                }
                break;
            case 3:
                System.out.println("Salary in sorted manner");
                Set <Employee>  sS = new TreeSet<Employee>(new idComparator());
                sS.add(emp0);
                sS.add(emp1);
                sS.add(emp2);
                for(Employee e: sS ){
                    System.out.println(e);
                }
                break;
            case 4:
                System.out.println("Department in sorted manner");
                Set <Employee>  dS = new TreeSet<Employee>(new idComparator());
                dS.add(emp0);
                dS.add(emp1);
                dS.add(emp2);
                for(Employee e: dS ){
                    System.out.println(e);
                }
                break;

        }

    }


}


