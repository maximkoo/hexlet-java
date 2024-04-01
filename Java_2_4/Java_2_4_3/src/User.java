import java.time.LocalDate;

import java.time.LocalDate;

public final class User {

    private String name;
    private LocalDate birthday;

    public User(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }


    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return name + " " + birthday.toString();
    }
}
