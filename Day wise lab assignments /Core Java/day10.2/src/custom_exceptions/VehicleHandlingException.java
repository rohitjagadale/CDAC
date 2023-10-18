package custom_exceptions;

public class VehicleHandlingException extends Exception {
	public VehicleHandlingException(String errMesg) {
		super(errMesg);
	}
}
