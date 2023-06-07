package ocp_n_m;

public class GenericDemo {

	public static void main(String[] args) {

		Calc<Integer> c = new Calc<Integer>();
		// add

		Calc<Float> d = new Calc();
		// add ->float

		Calc<Double> e = new Calc();
		// add -> double

	}
}

class Calc<T> {
	T a;
	T b;

	void add(T x,T y) {
		T z;
	}
	// add
	//

	// sub

	// div
	//int float double 
	//generic -> non primitive 
	//int -- Integer
}

