public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(104, "Mouse", "Electronics"),
                new Product(101, "Laptop", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(102, "Book", "Education"),
                new Product(105, "Watch", "Accessories")

        };

        System.out.println("Linear Search");

        Product result1 = SearchAlgorithms.linearSearch(products, 103);

        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Product not found.");

        System.out.println();

        // Sort before Binary Search
        SearchAlgorithms.sortProducts(products);

        System.out.println("Binary Search");

        Product result2 = SearchAlgorithms.binarySearch(products, 103);

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Product not found.");
    }
}