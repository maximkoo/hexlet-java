import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var products = List.of(
                new Product("bread", 5),
                new Product("milk", 10),
                new Product("fish", 30)
        );

        var result = App.getProductsByPrice(products, 10, 30);
        System.out.println(result); // => ["milk", "fish"]
    }

    public static List<String> getProductsByPrice(List<Product> list, int minPrice, int maxPrice) {
        List<String> list1 = new ArrayList<String>();
        for (Product product : list) {
            if ((product.getPrice() <= maxPrice) && (product.getPrice() >= minPrice)) {
                list1.add(product.getTitle());
            }
        }
        return list1;
    }
}
