import java.util.HashMap;
import java.util.Map;

class Warehouse {
    Map<String, Product> products;

    public Warehouse() {
        products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.name, product);
    }

    public void sendProductToStore(Product product, Store store, int quantity) {
        if (!products.containsKey(product.name) || products.get(product.name).quantity < quantity) {
            System.out.println("Insufficient stock in the warehouse.");
            return;
        }

        // Reduce the product quantity from the warehouse and add to the store
        products.get(product.name).quantity -= quantity;
        store.addProduct(product, quantity);
    }

    public void returnProductToStore(Product product, Store store, int quantity) {
        if (!store.products.containsKey(product.name) || store.products.get(product.name) < quantity) {
            System.out.println("Insufficient stock in the store.");
            return;
        }

        // Reduce the product quantity from the store and add back to the warehouse
        store.products.put(product.name, store.products.get(product.name) - quantity);
        products.get(product.name).quantity += quantity;
    }
}