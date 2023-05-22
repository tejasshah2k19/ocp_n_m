package ocp_n_m;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {

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

		for (Product p : products) {
			System.out.println(p.getName());
		}

		for (int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i).getName());
		}

		System.out.println("ForEach");
		products.forEach(p -> System.out.println(p.getName()));

		products.stream().forEach(p -> System.out.println(p.getName()));

		System.out.println(">12000");
		// filter the products who's prize is > 12000 and then print name
		products.stream().filter(p -> p.getPrice() > 12000).forEach(p -> System.out.println(p.getName()));
		
		//collect()
		List<Product> products12k = products.stream().filter(p -> p.getPrice() > 12000).collect(Collectors.toList());

	}
}

class Product {
	Integer productId;
	String name;
	Long price;
	String category;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
