public class ProductsStorage {
    private final int initial;
    private int goodsQuantity;
    private int maxCapacity;

    public ProductsStorage(int initial, int capacity) {
        this.initial = initial;
        this.maxCapacity = capacity;
        this.goodsQuantity = initial;
    }

    public void placeProducts(int amount) {
        if (goodsQuantity + amount > maxCapacity) {
            System.out.println("Превышена вместимость!");
            return;
        }
        goodsQuantity += amount;
    }

    public void takeProducts(int amount) {
        if (amount > goodsQuantity) {
            System.out.println("Столько нет!");
            return;
        }
        goodsQuantity -= amount;
    }

    public int getGoodsQuantity(){
        return goodsQuantity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
}