package ocp_n_m;

public class Lambda {

	public static void main(String[] args) {
		AThread a = new AThread();

		Thread t = new Thread(a);
		t.start();

		Cricketer c = new Cricketer();
		c.play();

		// lambda

		Player tp = () -> {
			System.out.println("TP:play()");
		};
		tp.play();

		Player hp = () -> {
			System.out.println("HP:play()");
		};
		hp.play();
		hp.myplay();
		
		

		Player vp = () ->  System.out.println("TP:play()");
		vp.play();
		
		
		Player.generalPaly();
	}
}

//thread 
class AThread implements Runnable {
	public void run() {
		System.out.println("AThread");
	}
}

@FunctionalInterface
interface Player {
	void play();// public abstract
	default void myplay() {
		System.out.println("myplay()");
	}
	static void generalPaly() {
		System.out.println("generalPlay");
	}
}

//SAM -> functional interface 
//you can have default method 
//you can static method 

class Cricketer implements Player {
	public void play() {
		System.out.println("Circketer::Play");
	}
}
