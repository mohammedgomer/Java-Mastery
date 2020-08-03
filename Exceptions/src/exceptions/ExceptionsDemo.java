package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {

	public static void show() {
		// Null represents the absence of a value
		try {
		var reader = new FileReader("File.txt");
		System.out.println("File Opened");
		} catch(FileNotFoundException ex) {
		System.out.println(ex.getMessage());
		}
		
	}

}
