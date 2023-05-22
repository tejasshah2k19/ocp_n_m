package ocp_n_m;

public class DiamondInJava8 {

	public static void main(String[] args) {
		Student s = new Student();
//		s.party();//goa? miami? 
		// s.Goa.party();
		s.myParty();
	}
}

interface Goa {
	default void party() {
		System.out.println("Goa::party()");
	}
}

interface Miami {
	default void party() {
		System.out.println("Miami::party()");
	}
}

class Student implements Goa, Miami {
	// party party

	void myParty() {
		Miami.super.party();
		Goa.super.party();

	}

	@Override
	public void party() {
		// TODO Auto-generated method stub
		Goa.super.party();
	}
}