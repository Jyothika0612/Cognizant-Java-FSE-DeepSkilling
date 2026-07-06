public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Accessories"),
                new Product(103, "Keyboard", "Accessories"),
                new Product(104, "Monitor", "Electronics"),
                new Product(105, "Printer", "Office")

        };

        System.out.println("===== Linear Search =====");

        Product result = SearchAlgorithms.linearSearch(products, "Keyboard");

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Product Not Found.");
        }

        SearchAlgorithms.sortProducts(products);

        System.out.println("\n===== Binary Search =====");

        result = SearchAlgorithms.binarySearch(products, "Keyboard");

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Product Not Found.");
        }

    }

}