public class Main {

    public static void main(String[] args) {

        Book[] books = {

                new Book(101, "Java Programming", "James Gosling"),
                new Book(102, "Python Basics", "Guido van Rossum"),
                new Book(103, "Data Structures", "Mark Allen"),
                new Book(104, "Spring Boot", "Craig Walls"),
                new Book(105, "React Guide", "Jordan Walke")

        };

        // Linear Search
        System.out.println("===== Linear Search =====");

        Book result = LibrarySearch.linearSearch(books, "Spring Boot");

        if (result != null) {

            System.out.println(result);

        } else {

            System.out.println("Book Not Found.");

        }

        // Sort Array
        LibrarySearch.sortBooks(books);

        // Binary Search
        System.out.println("\n===== Binary Search =====");

        result = LibrarySearch.binarySearch(books, "Spring Boot");

        if (result != null) {

            System.out.println(result);

        } else {

            System.out.println("Book Not Found.");

        }

    }

}