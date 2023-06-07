package ocp_n_m;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {

	public static void main(String[] args) {
		PrintNumber p = new PrintNumber();
		CopyNumber c = new CopyNumber();

//		p.start();
//		c.start();

		// pool->queue-> task submit -> worker -> execute

		//ExecutorService ex = Executors.newFixedThreadPool(5);//16 - 5 [ 11 ] 
		
		ExecutorService ex = Executors.newCachedThreadPool();//2 ---> max //60second 
		ex.submit(p);
		ex.submit(c);

		System.out.println("==>"+Runtime.getRuntime().availableProcessors());

		//1-10 -> sum 
		ex.shutdown();//program 
	}
}

class PrintNumber extends Thread {

	public void run() {
		print();
	}

	void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("print " + i);
		}
	}
}

class CopyNumber extends Thread {
	public void run() {
		copy();
	}

	void copy() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("copy " + i);
		}
	}
}