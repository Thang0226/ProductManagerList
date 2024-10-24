package views;

import controller.ProductManagerArrayList;
import controller.ProductManagerLinkedList;
import model.Product;

import java.util.Scanner;

public class LinkedListManagerTest {
	public static void main(String[] args) {
		ProductManagerLinkedList manager = new ProductManagerLinkedList();
		Scanner scanner = new Scanner(System.in);

		// Add some initial products
		Product product1 = new Product(1, "Product A", 100.0f, 10);
		Product product2 = new Product(2, "Product B", 150.0f, 5);
		Product product3 = new Product(3, "Product C", 200.0f, 20);
		Product product4 = new Product(4, "Product D", 300.0f, 25);

		manager.add(product1);
		manager.add(product2);
		manager.add(product3);
		manager.add(product4);

		// Display the current product list
		System.out.println("Initial product list:");
		manager.displayList();

		// Test changing product information
		System.out.print("Enter the product ID to change: ");
		int changeId = scanner.nextInt();
		manager.change(changeId);

		// Display the updated product list
		System.out.println("Updated product list:");
		manager.displayList();

		// Test removing a product
		System.out.print("Enter the product ID to remove: ");
		int removeId = scanner.nextInt();
		boolean removed = manager.remove(removeId);
		if (removed) {
			System.out.println("Product removed successfully.");
		} else {
			System.out.println("Product with ID " + removeId + " not found.");
		}

		// Display the product list after removal
		System.out.println("Product list after removal:");
		manager.displayList();

		// Test sorting products ascending
		System.out.println("Sorting products in ascending order of price:");
		manager.sortProductsAsc();
		manager.displayList();

		// Test sorting products descending
		System.out.println("Sorting products in descending order of price:");
		manager.sortProductsDesc();
		manager.displayList();

		// Test getting a product by ID
		System.out.print("Enter the product ID to get: ");
		int getId = scanner.nextInt();
		Product fetchedProduct = manager.get(getId);
		if (fetchedProduct != null) {
			System.out.println("Fetched product: " + fetchedProduct);
		} else {
			System.out.println("Product with ID " + getId + " not found.");
		}
	}
}
