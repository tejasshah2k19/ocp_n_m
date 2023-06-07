package ocp_n_m;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioDemo {
	public static void main(String[] args) {

		try {
			File file = new File("d:\\demo.txt");
			file.createNewFile();
			System.out.println(file.exists());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// nio
		try {
			Path p = Paths.get("demo.txt");
			Files.createFile(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//

	}
}
