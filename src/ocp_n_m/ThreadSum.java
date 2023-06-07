package ocp_n_m;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadSum extends Thread {
	int sum = 0;

	public void run() {
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			System.out.println(i);
		}
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

//		ThreadSum t = new ThreadSum();
//		t.start();
//		System.out.println("sum => " + t.sum);

		ThreadSumViaCallable t = new ThreadSumViaCallable();
		ExecutorService ex = Executors.newSingleThreadExecutor(); // w1
		Future<Integer> f = ex.submit(t);
		System.out.println("Sum = "+f.get());
	}
}

class ThreadSumViaCallable implements Callable<Integer> {
	int sum = 0;

	public Integer call() throws Exception {
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			System.out.println(i);
		}

		return sum;

	}
}