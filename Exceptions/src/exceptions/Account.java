package exceptions;

public class Account {
	private float balance;

	public void deposit(float value) {
		if (value <= 0) {
			// Telling caller of this method that they have passed an illegal argument
			throw new IllegalArgumentException();
		}
		
	}
	public void withdraw(float value) throws AccountException {
		if(value>balance) 
			// Chaining Exceptions - An exception cause another exception and so on 
			// We have wrapped this object, inside a more general exception 
			throw new AccountException(new InsufficientFundsException()); // We are going to say, this account 
			// exception was cause by the IFE F
	}
	
}
