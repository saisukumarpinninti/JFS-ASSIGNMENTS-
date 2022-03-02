import java.util.HashSet;
import java.util.Hashtable;

class Employee {

    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Employee))
            return false;
        Employee employee = (Employee) obj;
        return employee.getAge() == this.getAge()
                && employee.getName() == this.getName();
    }
    @Override
        public int hashCode() {
            int result=17;
            result=31*result+age;
            result=31*result+(name!=null ? name.hashCode():0);
            return result;
        }

}

public class Q5 {
    public static void main(String[] args) {
        Employee employee = new Employee("rajeev", 24);
        Employee employee1 = new Employee("rajeev", 25);
        Employee employee2 = new Employee("rajeev", 24);

        Hashtable<Employee,String> employees = new Hashtable();
        employees.put(employee,"1");
        employees.put(employee1,"2");

        System.out.println(employee.getName().equals(employee1.getName()));
        System.out.println("employee.hashCode():  " + employee.hashCode()
                + "  employee2.hashCode():" + employee2.hashCode());
    }
}
