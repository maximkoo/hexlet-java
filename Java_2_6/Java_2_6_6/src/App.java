import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Smartphone", "electronics", 500),
                new Product("Laptop", "electronics", 1000),
                new Product("Headphones", "electronics", 100),
                new Product("Smart Watch", "electronics", 300),
                new Product("T-Shirt", "cloth", 20),
                new Product("Sneakers", "shoes", 100),
                new Product("Coffee Machine", "kitchen", 200),
                new Product("Sunglasses", "accessories", 50),
                new Product("Book", "books", 15),
                new Product("Gaming Console", "electronics", 400)
        );

        System.out.println(getTotalPrice(products)); // 2300
    }

    public static int getTotalPrice(List<Product> list) {
        return list.stream()
                .filter(x -> x.getCategory().equals("electronics"))
                .map(x -> x.getPrice())
                .reduce(0, Integer::sum);
    }
}
