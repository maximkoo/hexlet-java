import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var users = new ArrayList<>(List.of(
                new User("Salli", LocalDate.of(1990, 12, 15)),
                new User("Gawen", LocalDate.of(2002, 10, 23)),
                new User("Emmalee", LocalDate.of(1992, 9, 16))
        ));

        var oldestUsers1 = getOldest(users);
        System.out.println(oldestUsers1); // => [Salli 1990-12-15]

        var oldestUsers2 = getOldest(users, 2);
        System.out.println(oldestUsers2); // => [Salli 1990-12-15, Emmalee 1992-9-16]
    }

    public static List<User> getOldest(List<User> users) {
        return getOldest(users, 1);
    }

    public static List<User> getOldest(List<User> users, int cnt) {
        List<User> u = new ArrayList<>(users);
        if (users.size() == 0) {
            return u;
        }
        users.sort((u1, u2) -> u1.getBirthday().compareTo(u2.getBirthday()));
        //Collections.sort(users, (u1,u2) -> u1.getBirthday().compareTo(u2.getBirthday()));
        ArrayList<User> sortedN = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            sortedN.add(u.get(i));
        }

        ArrayList<LocalDate> dates = new ArrayList<>();
        dates.sort((d1,d2) -> d1.compareTo(d2));
        Collections.sort(dates, (d1,d2) -> d1.compareTo(d2));

        return sortedN;
    }
}
