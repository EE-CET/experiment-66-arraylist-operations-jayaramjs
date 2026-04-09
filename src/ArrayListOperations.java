import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read N (number of items)
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        ArrayList<String> cart = new ArrayList<>();

        // Read the N items
        for (int i = 0; i < n; i++) {
            cart.add(scanner.next());
        }

        // Read the search item
        String searchItem = scanner.next();

        // Sort alphabetically
        Collections.sort(cart);

        // Print Output exactly as specified
        System.out.println("Sorted Items: " + cart);

        if (cart.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}
