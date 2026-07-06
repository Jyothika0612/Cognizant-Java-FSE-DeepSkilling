public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product p1 = new Product(101, "Laptop", 10, 65000);
        Product p2 = new Product(102, "Mouse", 50, 700);
        Product p3 = new Product(103, "Keyboard", 25, 1500);

        // Add Products
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        System.out.println("\n------ Inventory ------");
        inventory.displayProducts();

        // Update Product
        inventory.updateProduct(102, "Wireless Mouse", 40, 900);

        System.out.println("\n------ After Update ------");
        inventory.displayProducts();

        // Delete Product
        inventory.deleteProduct(103);

        System.out.println("\n------ After Delete ------");
        inventory.displayProducts();

    }
}