package utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

import com.app.core.Color;
import com.app.core.Vehicle;

import custom_exceptions.VehicleHandlingException;

public class VehicleValidationRules {
//add a static method to check for dups (PK : ch no)
	public static void checkForDups(String newChNo, List<Vehicle> vehicles) throws VehicleHandlingException {
		// contains : argument : Generic type T of the List (here : Vehicle)
		// i/p : showroom : [v1(abc-1234....),v2(abc-1230....),v3(abc-1238....)....]
		Vehicle newVehicle = new Vehicle(newChNo); // abc-1248
		if (vehicles.contains(newVehicle))
			throw new VehicleHandlingException("Vehicle can't be added : dup ch no !!!!!!");
		System.out.println("no dups ...");
	}

	/*
	 * contains method will internally iterate over the list elems n invokes equals.
	 * When equals rets true , contains rets true Iterates over the size() of the
	 * list -- When equals method rets false ,for all elems in the list, contains :
	 * rets false
	 * 
	 */
	// add a method for validation rule for vehicle color
	public static Color parseAndValidateColor(String color) throws IllegalArgumentException {
		return Color.valueOf(color.toUpperCase());// method throws : IllegalArgumentException , in case of clr out of
													// range
	}

	// add a method for validating : date
	public static LocalDate parseAndValidateDate(String date) throws DateTimeParseException, VehicleHandlingException {
		// parsing
		LocalDate manuDate = LocalDate.parse(date);
		// => parsing done --now proceed to validation
		// manufactureDate : must be after 1st Jan 2020
		LocalDate checkDate = LocalDate.of(2020, 1, 1);
		if (manuDate.isBefore(checkDate))
			throw new VehicleHandlingException("Invalid Manufacture Date!!!!!");
		// => parsing n validation success
		return manuDate;
	}

	// add a method to validate all i/ps : invoked by the tester
	// i/p : complete vehicle details
	// in case of failure : throw the system/custom exc
	// in case of success : wrap all validated i/ps in Vehicle n ret it to caller
	public static Vehicle validateAllInputs(String chasisNo, String vehicleClr, int basePrice, String manufactureDate,
			String company, List<Vehicle> showroom)
			throws VehicleHandlingException, IllegalArgumentException, DateTimeParseException {
		// invoke individual validation rules
		checkForDups(chasisNo, showroom);
		Color color = parseAndValidateColor(vehicleClr);
		LocalDate date = parseAndValidateDate(manufactureDate);
		return new Vehicle(chasisNo, color, basePrice, date, company);
	}

}
