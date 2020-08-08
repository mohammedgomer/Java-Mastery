package exceptions;
// Custom exception 
// Checked -> Exception (should be checked as its a situation we should anticipate)
// Unchecked (Runtime) -> RuntimeException

public class InsufficientFundsException extends Exception {
	
	public InsufficientFundsException() {
		super("Insufficient funds in your account");
	}

public InsufficientFundsException(String message) {
	super(message);
}
}
