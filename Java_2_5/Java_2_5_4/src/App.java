public class App {
    public static void main(String[] args) {
        var triple = new SimpleTriple("str", 1, true);

        System.out.println(triple.getLeft()); // str
        System.out.println(triple.getRight()); // true
        System.out.println(triple.getMiddle()); // 1
    }
}
