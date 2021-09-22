package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import utils.ProductConsumer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Jumper Pct. 30 und", 5.90));
		products.add(new Product("Arduino Uno", 150.00));
		products.add(new Product("Arduino Mini", 100.00));
		products.add(new Product("Arduino Mega", 200.00));
		products.add(new Product("LED", 0.50));
		products.add(new Product("Resistor 300 Ohm", 0.80));
		

		// aumentar valor do produto em 10%		
		//products.forEach(new ProductConsumer()); //utilizando uma classe que implementa a interface Consumer
		products.forEach(p -> p.setPrice(p.getPrice() * 1.1)); //utilizando expressoes lambda
		
		for(Product p : products) {
			System.out.println(p.getName() + ", " + p.getPrice());
		}
	}

}
