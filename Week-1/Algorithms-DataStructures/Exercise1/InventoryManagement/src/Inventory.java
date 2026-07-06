import java.util.HashMap;

public class Inventory {

    HashMap<Integer, Product> inventory = new HashMap<>();

    // Add Product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Product Added Successfully.");
    }

    // Update Product
    public void updateProduct(int productId, String name, int quantity, double price) {

        if (inventory.containsKey(productId)) {

            Product product = inventory.get(productId);

            product.setProductName(name);
            product.setQuantity(quantity);
            product.setPrice(price);

            System.out.println("Product Updated Successfully.");

        } else {

            System.out.println("Product Not Found.");

        }

    }

    // Delete Product
    public void deleteProduct(int productId) {

        if (inventory.containsKey(productId)) {

            inventory.remove(productId);
            System.out.println("Product Deleted Successfully.");

        } else {

            System.out.println("Product Not Found.");

        }

    }

    // Display Products
    public void displayProducts() {

        if (inventory.isEmpty()) {

            System.out.println("Inventory is Empty.");
            return;

        }

        for (Product product : inventory.values()) {

            System.out.println(product);

        }

    }

}