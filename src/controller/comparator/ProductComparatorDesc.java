package controller.comparator;

import model.Product;

import java.util.Comparator;

public class ProductComparatorDesc implements Comparator<Product> {
	@Override
	public int compare(Product o1, Product o2) {
		return Float.compare(o2.getPrice(), o1.getPrice());
	}
}
