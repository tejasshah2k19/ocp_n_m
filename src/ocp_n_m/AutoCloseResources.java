package ocp_n_m;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class AutoCloseResources {

	public static void main(String[] args) {
		File file = new File("d:\\del\\a.txt");
		try (
//				String str = new String("test");
				FileWriter fw = new FileWriter(file);
				Scanner scr = new Scanner(System.in);
				Iphone i = new Iphone();) {
			//
			fw.write('r');

			// fw.close(); // stream io network resource ->
			// scr.close(); // try catch
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("The ENd");
	}
	// java 7
	// try with auto resource deallocation
	// try with auto resource closable

	// how java knows --> resource -> close() ?
	// close()
	// Closeable -> implements -> close()
	// AutoCloseable

}

class Iphone implements AutoCloseable {
	public void close() {
		System.out.println("close() ::  Iphone ");
	}
}
