import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var cars = List.of(
                new Car("Jaguar", "XK120", LocalDate.of(1950, 8, 21)),
                new Car("Mercedes-Benz", "W114", LocalDate.of(1968, 7, 10)),
                new Car("Fiat", "600", LocalDate.of(1956, 1, 1))
        );

        var result = App.getCars(cars, 1960);
        System.out.println(result); // => [Fiat 600, Jaguar XK120]
    }

    public static List<String> getCars(List<Car> cars, int yearBefore) {
        List<String> list = new ArrayList<>();
        for (Car car : cars) {
            if (car.getManufacturedAt().getYear() <= yearBefore) {
                list.add(car.toString());
            }
        }
        Collections.sort(list);
        return list;
    }
}
