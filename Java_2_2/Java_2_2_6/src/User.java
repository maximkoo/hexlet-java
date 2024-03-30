
import java.util.List;
import java.util.ArrayList;

public final class User {

    private String name;
    private List<User> friends;

    public User(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void addFriend(User friend) {
        friends.add(friend);
    }

    @Override
    public String toString() {
        return name;
    }
}
