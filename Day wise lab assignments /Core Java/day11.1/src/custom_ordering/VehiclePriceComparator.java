package custom_ordering;

import java.util.Comparator;

import com.app.core.Vehicle;

public class VehiclePriceComparator implements Comparator<Vehicle> {
	@Override
	public int compare(Vehicle v1, Vehicle v2) {
		System.out.println("in compare");
		if((v1.getBasePrice()+v1.getVehicleClr().getAdditionalCost())<(v2.getBasePrice()+v2.getVehicleClr().getAdditionalCost()))
			return -1;
		if((v1.getBasePrice()+v1.getVehicleClr().getAdditionalCost())>(v2.getBasePrice()+v2.getVehicleClr().getAdditionalCost()))
			return 1;
		return 0;
	}
}
