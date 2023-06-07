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

		Player vp = () -> System.out.println("TP:play()");
		vp.play();

		Player.generalPaly();

		String str = "ram";
		MethodArg m = (data) -> {
			String data2 = "";
			return "ram";
		};
		MethodArg x = (data) -> data;
		MethodArg y = (data) -> {
			return data;
		};
		MethodArg z = (String data) -> {
			return data;
		};

		TokenGenerator otp = () -> {
			return "1234";
		};

		TokenGenerator accessToken = () -> {
			return "a1d2sdff3t4t";
		};

		System.out.println(otp.generateToken());
		System.out.println(accessToken.generateToken());

//		Supplier< >  		general 
//		DoubleSupplier		double 
	
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

interface MethodArg {
	String add(String str);
}

interface TokenGenerator {
	String generateToken();
}
