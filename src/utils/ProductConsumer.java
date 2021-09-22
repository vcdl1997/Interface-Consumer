package utils;

import java.util.function.Consumer;

import entities.Product;

public class ProductConsumer implements Consumer<Product>{

	public void accept(Product p) {
		Double increase = p.getPrice() * 1.1;
		
		p.setPrice(p.getPrice() + increase);
	}

}
