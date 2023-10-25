package custom_exception;

public class StockHandlingException extends Exception {
	public StockHandlingException(String mesg) {
		super(mesg);
	}
}
