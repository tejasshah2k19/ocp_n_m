package ocp_n_m;

public class AssertDemo {

	public static void main(String[] args) {

		
		//you need enable the assertion
		//pass jvm  -ea -enableAssertions
		
		//java -ea 
		
		int bal = 900;

		//assert (bal < 800); // true -> go ahead , false -> error

		// true -> go ahead , false -> error
		 assert(bal < 800):"Bal must be > 800";

		System.out.println("done");
	}
}

//1.3 
//assert -> 