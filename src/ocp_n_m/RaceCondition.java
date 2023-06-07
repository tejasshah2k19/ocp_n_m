package ocp_n_m;

public class RaceCondition {
	int sum;

	void addByOne() {
		for (int i = 1; i <= 1000000000; i++) {
			sum = sum + 1;
		}
	}

	void printSum() {
		System.out.println(sum);
	}

	public static void main(String[] args) {
		RaceCondition r = new RaceCondition();
		r.addByOne();
		r.addByOne();
		
 		r.printSum();
	}
}
