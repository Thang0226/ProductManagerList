package controller;

public interface Manager<T> {
	// Add new product to list
	boolean add(T product);

	// Change a product in list based on ID
	void change(int id);

	// Delete a product in list based on ID
	boolean remove(int id);

	// Display list of products
	void displayList();

	// Find a product based on name
	T get(int id);

	// Sort products based on price, ascending
	void sortProductsAsc();

	// Sort products based on price, descending
	void sortProductsDesc();
}
