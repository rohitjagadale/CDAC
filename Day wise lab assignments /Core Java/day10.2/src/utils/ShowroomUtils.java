package utils;

import java.util.List;

import com.app.core.Vehicle;

import custom_exceptions.VehicleHandlingException;

public class ShowroomUtils {
//add a method to get Vehicle details by it's ch no
	// i/p : ch no, list , o/p : Vehicle or custom exc
	public static Vehicle findByChasisNo(String chNo, List<Vehicle> vehicles)
			throws VehicleHandlingException {
		// 1. wrap ch no in Vehicle => Boxing conversion(i.e PK --> Vehicle)
		Vehicle v = new Vehicle(chNo);
		int index = vehicles.indexOf(v);
		if (index == -1) // => not found !
			throw new VehicleHandlingException("Invalid ch no !!!!");
		//=> vehicle exists @ index
		return vehicles.get(index);
	}
}
