import java.util.Map;

public class App {
    private static Map<String, Double> products = Data.getProducts();

    public static void main(String[] args) {
        var discounts = Map.of(
                "Bread", 10.0,
                "Salmon", 20.0
        );

        // Скидка на хлеб 10 процентов
        System.out.println(getPriceWithDiscount(discounts, "Bread")); // 9.0

        // На молоко сегодня скидок нет
        System.out.println(getPriceWithDiscount(discounts, "Milk")); // 20.0
        System.out.println(getPriceWithDiscount(discounts, "Olives")); // null
    }

    public static Double getPriceWithDiscount(Map<String, Double> discMap, String name) {
        Double price = products.get(name);
        if (price == null) {
            return null;
        }
        Double disc = discMap.get(name);
        if (disc == null) {
            return price;
        } else {
            return price * ((100 - disc) / 100);
        }
    }
}
