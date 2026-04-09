import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Check if there is an integer input for N
        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();
        ArrayList<String> cart = new ArrayList<>();

        // Read N items and add them to the ArrayList
        for (int i = 0; i < n; i++) {
            cart.add(scanner.next());
        }

        // Read the item to search for
        String searchItem = scanner.next();

        // Sort the items alphabetically
        Collections.sort(cart);

        // Output the sorted list in the required format
        System.out.println("Sorted Items: " + cart);

        // Check if the specific item exists and print result
        if (cart.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}
