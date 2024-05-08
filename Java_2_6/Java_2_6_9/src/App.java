import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) throws Throwable {
        var users = new ArrayList(
                List.of(
                        new User(1, "John"),
                        new User(2, "Anna"),
                        new User(3, "Alex")
                )
        );

        var user = findUserById(users, 1);
        user.getName(); // John

// Пользователя с таким id нет
        findUserById(users, 1); // Error
    }

    public static User findUserById(List<User> users, long id) throws Throwable {
        Optional<User> a = users.stream().filter(x -> x.getId() == id).findFirst();
        return a.orElseThrow(() -> new RuntimeException("User not found"));
    }
}
