package ocp_n_m;

import java.util.ArrayDeque;

public class ArrayDqDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> a = new ArrayDeque<Integer>();

		a.add(10);
		a.add(20);
		a.add(30);

		System.out.println(a);

		// q-> 10 20 30 40 50
		// delete -> 10

		// add add an element at last

		a.addFirst(25);
		System.out.println(a);

	}
}
