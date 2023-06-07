package ocp_n_m;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;

public class Stream2 {

	public static void main(String[] args) {

		// product
		// name price qty

		// list

		// collection

		// operation -> using stream

		//
		List<Product> products = new ArrayList<Product>();
		Product p1 = new Product();
		p1.setProductId(1);
		p1.setName("iphone13");
		p1.setCategory("mobile");
		p1.setPrice(10000L);

		Product p2 = new Product();
		p2.setProductId(2);
		p2.setName("iphone14");
		p2.setCategory("mobile");
		p2.setPrice(12000L);

		Product p3 = new Product();
		p3.setProductId(3);
		p3.setName("iphone15");
		p3.setCategory("mobile");
		p3.setPrice(15000L);

		products.add(p1);
		products.add(p2);
		products.add(p3);

		// products -> 3 product

		for (int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i).getName());
		}

		for (Product p : products) {
			System.out.println(p.getName());
		}

		System.out.println("ForEach"); // Consumer
		products.stream().forEach(p -> System.out.println(p.getName()));

		System.out.println("Filter"); // Predicate
		products.stream().filter(p -> p.price > 12000).forEach(p -> System.out.println(p.getName()));

		System.out.println("Map"); // Function
		products.stream().map(p -> p.price + 1000).forEach(p -> System.out.println(p));

		// Supplier

		Optional<Product> pr = products.stream().findFirst().filter(p -> p.price > 5000);

		// java8 -> Optional -> method -> return object -> null
		// NullPointerException

		if (pr.isPresent()) {
			System.out.println(pr.get()); // optional covert product -> data | null
		} else {
			System.out.println("No MatchFound");
		}

		// product -> price ->
		OptionalLong maxPrice = products.stream().mapToLong(p -> p.price).max();

		if (maxPrice.isPresent()) {
			System.out.println(maxPrice.getAsLong());
		}
		// min sum count average

		// flatmap -> Collection -> Map { key:value }


		// 0 -> [ 1 2 3 4 ]
		// 1 -> [33 44 55 66]

		// index:value -> flatmap

		List<Integer> listInt = new ArrayList<Integer>();
		listInt.add(25);
		listInt.add(125);
		listInt.add(250);
		listInt.add(500);

		List<Integer> listInt2 = new ArrayList<Integer>();
		listInt2.add(25);
		listInt2.add(125);
		listInt2.add(250);
		listInt2.add(500);

		
		List<Integer> listInt3 = new ArrayList<Integer>();
		listInt3.add(25);
		listInt3.add(125);
		listInt3.add(250);
		listInt3.add(500);

		List<List<Integer>> listoflist = new ArrayList<List<Integer>>();
		listoflist.add(listInt);
		listoflist.add(listInt2);
		listoflist.add(listInt3);
		
		
		listInt.stream().filter(p -> p % 2 == 0).forEach(p -> System.out.println(p));
		//			->      list --> list
		listoflist.stream().flatMap(p->p.stream()).filter(p -> p % 2 == 0).forEach(p -> System.out.println(p));

		
	}
}



















