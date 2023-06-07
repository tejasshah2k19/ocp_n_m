package ocp_n_m;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//how your class is gonna sort 
public class ComparatorComparable {

	public static void main(String[] args) {

		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(12);
		alist.add(120);
		alist.add(11);
		System.out.println(alist);
		Collections.sort(alist);
		System.out.println(alist);

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
		p3.setPrice(11000L);

		products.add(p1);
		products.add(p2);
		products.add(p3);

		// code
		Collections.sort(products);

		products.stream().forEach(p -> System.out.println(p.name + " " + p.price));

		ArrayList<String> strList = new ArrayList<String>();

		strList.add("ram");
		strList.add("shyam");
		strList.add("hanuman");

		Collections.sort(strList, new StringSorter());

		strList.forEach(p -> System.out.println(p));

		strList.stream().forEach(System.out::println);

		Long l = products.stream().collect(Collectors.summingLong(p -> p.price));
		System.out.println(l);

		products.stream().sorted((p, q) -> p.price.compareTo(q.price));

		products.stream().sorted((p, q) -> p.name.compareTo(q.name));

		products.stream().sorted((p, q) -> p.name.compareTo(q.name));

	}
}

class StringSorter implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		if (o1.length() > o2.length()) {
			return -1;
		} else if (o1.length() < o2.length()) {
			return 1;
		}
		return 0;
	}

}
