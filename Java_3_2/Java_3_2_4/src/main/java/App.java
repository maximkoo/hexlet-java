public class App {
    public static void main(String[] args) {
        var department = new Department("construction");
        var employee = new Employee("Mike Arts", "architect");
        department.addEmployee(employee);
        department.removeEmployee(employee);
    }
}
