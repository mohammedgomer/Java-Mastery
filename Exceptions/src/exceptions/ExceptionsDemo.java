package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {

public static void show() {
	var account = new Account();
	try {
		account.withdraw(10);
	} catch (AccountException e) {
		// TODO Auto-generated catch block
		var cause = e.getCause();
		e.printStackTrace();
	}
}
	
	
	
	
//		// Null represents the absence of a value
//		try (
//				var reader = new FileReader("file.txt");
//				var writer = new FileWriter("...");
//			) {
//			
//			var value = reader.read();
//		} catch (IOException e) {
//			System.out.println("Could not read data.");
//
//			// Finally block will always get executed,
//			// whether we have an exception or not
//		}
//
	}
	
