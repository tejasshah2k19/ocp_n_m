package ocp_n_m;

import java.util.ArrayList;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(102);
		list.add(103);
		list.add(104);
		list.add(105);
		list.add(106);// 1000

		ForkJoinPool fj = new ForkJoinPool(3);

		long start = System.currentTimeMillis();

		fj.submit(() -> {
			
			//fork-> split  divide -> worker allocate
			list.parallelStream().forEach(t -> {
				try {

					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // 100ms
			});

		}).join();

		long end = System.currentTimeMillis();
		System.out.println(end - start);

		// stream -> t -> 100 milisecond -> 600

		// 6 -> 3 3 ->

		// 6
		// 3 2
		// 1 2 1 1

		// 1 1 1 1 1 => 5
	}
}
