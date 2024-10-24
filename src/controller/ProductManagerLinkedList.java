package controller;

import controller.comparator.ProductComparatorAsc;
import controller.comparator.ProductComparatorDesc;
import model.Product;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManagerLinkedList implements Manager<Product> {
	private final LinkedList<Product> products;

	public ProductManagerLinkedList() {
		this.products = new LinkedList<>();
	}

	@Override
	public boolean add(Product product) {
		return products.add(product);
	}

	@Override
	public void change(int id) {
		for (Product product : products) {
			if (product.getId() == id) {
				changeProduct(product);
				return;
			}
		}
	}

	private void changeProduct(Product product) {
		System.out.println("Product information: " + product);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter new product name: ");
		String newName = input.nextLine();
		System.out.print("Enter new product price: ");
		float newPrice = input.nextFloat();
		System.out.print("Enter new product quantity: ");
		int newQuantity = input.nextInt();

		product.setName(newName);
		product.setPrice(newPrice);
		product.setQuantity(newQuantity);
	}

	@Override
	public boolean remove(int id) {
		for (Product product : products) {
			if (product.getId() == id) {
				products.remove(product);
				return true;
			}
		}
		return false;
	}

	@Override
	public void displayList() {
		System.out.println("List of products:");
		for (Product product : products) {
			System.out.println("\t" + product);
		}
	}

	@Override
	public Product get(int id) {
		for (Product product : products) {
			if (product.getId() == id) {
				return product.clone();
			}
		}
		return null;
	}

	@Override
	public void sortProductsAsc() {
		Collections.sort(products, new ProductComparatorAsc());
	}

	@Override
	public void sortProductsDesc() {
		Collections.sort(products, new ProductComparatorDesc());
	}
}
