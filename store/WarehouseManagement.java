public class WarehouseManagement {
    public static void main(String[] args) {
        // Create products
        Product danceProduct = new Product("Dance Item", ProductType.DANCE, 100);
        Product clothingProduct = new Product("Clothing Item", ProductType.CLOTHING, 200);
        Product economyProduct = new Product("Economy Item", ProductType.ECONOMY, 150);

        // Create stores
        Store groceryStore = new Store("Grocery Store", StoreType.GROCERY);
        Store clothingStore = new Store("Clothing Store", StoreType.CLOTHING_STORE);
        Store thriftStore = new Store("Thrift Store", StoreType.THRIFT_STORE);

        // Create warehouse
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct(danceProduct);
        warehouse.addProduct(clothingProduct);
        warehouse.addProduct(economyProduct);

        // Perform actions
        warehouse.sendProductToStore(danceProduct, groceryStore, 50);
        groceryStore.sellProduct(danceProduct, 30);
        warehouse.returnProductToStore(danceProduct, groceryStore, 10);

        warehouse.sendProductToStore(clothingProduct, clothingStore, 10);
        groceryStore.sellProduct(clothingProduct, 5);
        warehouse.returnProductToStore(clothingProduct, clothingStore, 3);

    }
}