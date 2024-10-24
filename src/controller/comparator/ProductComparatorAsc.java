package controller.comparator;

import model.Product;

import java.util.Comparator;

public class ProductComparatorAsc implements Comparator<Product> {
	@Override
	public int compare(Product o1, Product o2) {
		return Float.compare(o1.getPrice(), o2.getPrice());
	}
}
