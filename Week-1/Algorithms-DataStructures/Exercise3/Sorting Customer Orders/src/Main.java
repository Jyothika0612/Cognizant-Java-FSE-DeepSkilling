public class Main {

    public static void main(String[] args) {

        Order[] orders = {

                new Order(101, "Rahul", 2500),
                new Order(102, "Anjali", 7000),
                new Order(103, "Kiran", 1500),
                new Order(104, "Sneha", 4500),
                new Order(105, "Arjun", 3200)

        };

        System.out.println("===== Bubble Sort =====");

        Sorting.bubbleSort(orders);

        Sorting.display(orders);

        Order[] orders2 = {

                new Order(101, "Rahul", 2500),
                new Order(102, "Anjali", 7000),
                new Order(103, "Kiran", 1500),
                new Order(104, "Sneha", 4500),
                new Order(105, "Arjun", 3200)

        };

        System.out.println("===== Quick Sort =====");

        Sorting.quickSort(orders2, 0, orders2.length - 1);

        Sorting.display(orders2);

    }

}