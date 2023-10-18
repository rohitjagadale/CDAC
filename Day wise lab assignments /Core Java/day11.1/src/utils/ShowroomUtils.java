package utils;

import java.util.ArrayList;
import java.util.List;

import com.app.core.Color;
import com.app.core.Vehicle;
import static java.time.LocalDate.parse;

import custom_exceptions.VehicleHandlingException;

public class ShowroomUtils {
//add a method to get Vehicle details by it's ch no
	// i/p : ch no, list , o/p : Vehicle or custom exc
	public static Vehicle findByChasisNo(String chNo, List<Vehicle> vehicles) throws VehicleHandlingException {
		// 1. wrap ch no in Vehicle => Boxing conversion(i.e PK --> Vehicle)
		Vehicle v = new Vehicle(chNo);
		int index = vehicles.indexOf(v);// O(n)
		if (index == -1) // => not found !
			throw new VehicleHandlingException("Invalid ch no !!!!");
		// => vehicle exists @ index
		return vehicles.get(index);// O(1)
	}

	// add a method to ret populated list of vehicles , with sample data
	public static List<Vehicle> populateShowroom() {
		// create empty List
		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(new Vehicle("abc-1000", Color.BLACK, 200000, parse("2023-01-01"), "Mahindra"));
		vehicles.add(new Vehicle("abc-1010", Color.WHITE, 250000, parse("2022-01-01"), "Honda"));

		vehicles.add(new Vehicle("abc-1003", Color.WHITE, 230000, parse("2021-11-05"), "Maruti"));

		vehicles.add(new Vehicle("abc-1002", Color.GREY, 280000, parse("2022-06-01"), "Mahindra"));

		vehicles.add(new Vehicle("abc-1009", Color.SILVER, 250000, parse("2023-08-01"), "Honda"));

		vehicles.add(new Vehicle("abc-1005", Color.BLACK, 240000, parse("2020-11-01"), "Mahindra"));

		vehicles.add(new Vehicle("abc-1007", Color.BLACK, 290000, parse("2022-11-23"), "Maruti"));

		return vehicles;
	}
}
