package basic.class1.question;

public class ProductOrder {
    private final String productName;
    private final int price;
    private final int quantity;

    public ProductOrder(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "productName :" + productName + ", price=" + price + ", quantity=" + quantity;
    }
}
