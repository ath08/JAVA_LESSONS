import java.util.HashMap;
import java.util.Map;


class Store {
    String name;
    StoreType type;
    Map<String, Integer> products;

    public Store(String name, StoreType type) {
        this.name = name;
        this.type = type;
        this.products = new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        if (product.type == ProductType.DANCE && type != StoreType.THRIFT_STORE) {
            System.out.println("Invalid product type for this store.");
            return;
        }

        // Add the product to the store's inventory
        products.put(product.name, products.getOrDefault(product.name, 0) + quantity);
    }

    public void sellProduct(Product product, int quantity) {
        if (!products.containsKey(product.name) || products.get(product.name) < quantity) {
            System.out.println("Insufficient stock.");
            return;
        }

        // Reduce the product quantity from the store's inventory
        products.put(product.name, products.get(product.name) - quantity);
    }
}