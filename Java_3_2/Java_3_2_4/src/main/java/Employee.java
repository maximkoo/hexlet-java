import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Employee {
    String fullname;
    String position;
    Department department;

    public Employee(String fullname, String position) {
        this.fullname = fullname;
        this.position = position;
    }
}
