import java.util.Map;

public class App {
    public static void main(String[] args) {
        var products = Map.of(
                "Apple", 5,
                "Lemon", 9,
                "Pear", 15
        );

        printBalance(products, 10); // =>
        // Apple
        // Lemon
    }

    public static void printBalance(Map<String, Integer> products, int amount) {
        products.forEach((key, value) -> {
            if (products.get(key) < amount) {
                System.out.println(key);
            }
        });
    }
}
