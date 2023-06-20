package ocp_n_m;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo implements Runnable {

	static CyclicBarrier cb = new CyclicBarrier(3);

	public static void main(String[] args) {
		CyclicBarrierDemo cc = new CyclicBarrierDemo();
		Thread t = new Thread(cc);
		t.start();
	}

	public void run() {
		System.out.println("Process Started......");
		System.out.println("Total Parties => " + cb.getParties());

		ThreadSum1 t1 = new ThreadSum1();
		ThreadMul t2 = new ThreadMul();

		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);

		tt1.start();
		tt2.start();

		try {
			cb.await();//tt1 tt2 -> 
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println(t1.sum + t2.ans);
		//
		cb.reset();
		System.out.println("Process End.............");
	}
}

class ThreadSum1 implements Runnable {
	int sum;

	public void run() {
		//

		sum = 10;

		try {
			CyclicBarrierDemo.cb.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}

	}
}

class ThreadMul implements Runnable {
	int ans;

	public void run() {
		//
		ans = 20;
		try {
			CyclicBarrierDemo.cb.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}

	}
}
