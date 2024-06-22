import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Department {
    @Setter
    String title;
    List<Employee> employees = new ArrayList<Employee>();

    public Department(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(String name, String position) {
        //Employee e = new Employee(name, position, this);
        Employee e = new Employee(name, position);
        e.setDepartment(this);
        employees.add(e);
    }

    public void addEmployee(Employee e) {
        e.setDepartment(this);
        employees.add(e);
    }

    public void removeEmployee(String name) {
        employees.removeIf(x -> x.getFullname().equals(name));
    }

    public void removeEmployee(Employee emp) {
        emp.setDepartment(null);
        employees.removeIf(x -> x == emp);
    }
}
