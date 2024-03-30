import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        var user1 = new User("John");
        user1.addFriend(new User("Ellery"));

        var user2 = new User("Anna");
        user2.addFriend(new User("Abey"));

        // Общий друг двух пользователей
        var friend = new User("Jacky");
        user1.addFriend(friend);
        user2.addFriend(friend);

        List<User> commonFriends = App.getCommonFriends(user1, user2);
        System.out.println(commonFriends); // => ["Jacky"]
    }

    public static List<User> getCommonFriends(User user1, User user2) {
        List<User> list = new ArrayList<>();
        for (User friend : user1.getFriends()) {
            if (user2.getFriends().contains(friend)) {
                list.add(friend);
            }
        }
        return list;
    }
}
