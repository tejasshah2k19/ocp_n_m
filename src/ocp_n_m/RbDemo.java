package ocp_n_m;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class RbDemo {

	public static void main(String[] args) {
		Locale fr = new Locale("fr");
		Locale es = new Locale("es");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 for Frensh 2 for Spanish");
		int ch = sc.nextInt();

		if (ch == 1) {
			ResourceBundle rd = ResourceBundle.getBundle("mydata", fr);
			System.out.println(rd.getString("hello"));
		} else if (ch == 2) {
			ResourceBundle rd = ResourceBundle.getBundle("mydata", es);
			System.out.println(rd.getString("hello"));
		}

	}
}
