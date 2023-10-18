package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.app.core.Color;
import com.app.core.Vehicle;

import custom_exceptions.VehicleHandlingException;
import custom_ordering.VehiclePriceComparator;
import utils.ShowroomUtils;
import utils.VehicleValidationRules;
import static utils.VehicleValidationRules.*;
import static utils.ShowroomUtils.findByChasisNo;
import static utils.ShowroomUtils.populateShowroom;

public class ShowroomManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init phase
			// create suitable D.S :from populated AL
			List<Vehicle> vehicleList = populateShowroom();
			boolean exit = false;
			while (!exit) {
				// servicing phase : UI
				System.out.println("Options : 1 . Add a vehicle 2.Display All \n" + "3. Get Specific Vehicle details \n"
						+ "4. Apply discount on specific vehicle \n" + "5. Apply discount on all vehicles by clr \n"
						+ "6. Delete vehicle details by PK \n" + "7. Delete vehicle details by Color\n"
						+ "8. Sort the vehicles as per ch no\n" + "9. Sort the vehicles as per price 0.Exit");
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter vehicle details :  chasisNo,  vehicleClr,  basePrice,  manufactureDate, company");
						// Tester invokes all validation rules
						Vehicle validatedVehicle = validateAllInputs(sc.next(), sc.next(), sc.nextInt(), sc.next(),
								sc.next(), vehicleList);
						// successful validations
						vehicleList.add(validatedVehicle);
						System.out.println("added vehicle to the showroom");
						break;
					case 2: // display all
						System.out.println("Showroom details");
						// via for-each
						for (Vehicle v : vehicleList)
							System.out.println(v);// toString : Vehicle (with clr based net price)
						break;
					case 3:
						System.out.println("Enter ch no , to get vehicle details");
						// Tester invokes : Showroom Utils method
						Vehicle vehicle = findByChasisNo(sc.next(), vehicleList);
						// => found
						System.out.println(vehicle);
						break;
					case 4:
						System.out.println("Enter ch no n discount");
						vehicle = findByChasisNo(sc.next(), vehicleList);
						// => found , set price
						vehicle.setBasePrice(vehicle.getBasePrice() - sc.nextInt());
						System.out.println("discount applied....");
						break;
					case 5:
						System.out.println("Enter date n discount");
						LocalDate date = parseAndValidateDate(sc.next());
						int discount = sc.nextInt();
						// since the search criteria is NOT PK based : iterate n search
						System.out.println("Vehicles discounted : ");
						for (Vehicle v : vehicleList)
							if (v.getManufactureDate().isBefore(date)) {
								System.out.println(v.getChasisNo());
								v.setBasePrice(v.getBasePrice() - discount);
							}
						break;
					case 6:
						System.out.println("Enter ch no , to delete details");
						vehicle = new Vehicle(sc.next());// boxing : wraps PK in the Vehicle
						boolean removed = vehicleList.remove(vehicle);
						if (!removed)
							throw new VehicleHandlingException(
									"Invalid ch no , Vehicle details can't be deleted!!!!!!!!!!!!!!!!");
						System.out.println("Vehicle removed !");
						break;
					case 7:
						System.out.println("Enter color ");
						Color clr = parseAndValidateColor(sc.next());
//						for (Vehicle v : vehicleList)
//							if (v.getVehicleClr() == clr) // works same as equals , since Enum instances are singleton
//								vehicleList.remove(v);
						// attach explicit Iterator
						Iterator<Vehicle> itr = vehicleList.iterator();
						while (itr.hasNext()) {
							vehicle = itr.next();
							if (vehicle.getVehicleClr() == clr) {
								itr.remove();
								System.out.println("removed vehicle with ch no " + vehicle.getChasisNo());
							}

						}
						break;
					/*
					 * Above commented code : java.util.ConcurrentModificationExc. will be discussed
					 * along with Iterator
					 */
					case 8:
						// sort as per ch no
						Collections.sort(vehicleList);
						System.out.println("Sorted list as per asc ch no");
						for (Vehicle v : vehicleList)
							System.out.println(v);
						break;
					case 9:// sort as per price
						Collections.sort(vehicleList, new VehiclePriceComparator());
						System.out.println("Sorted list as per asc price");
						for (Vehicle v : vehicleList)
							System.out.println(v);
						break;

					case 0: // shut down (destroy phase)
						exit = true;
						break;
					}
				} catch (Exception e) {
					// System.out.println(e);
					e.printStackTrace();
					System.out.println("Pls retry....");
					// to read off all pending i/ps
					sc.nextLine();
				}
			}

		} // sc.close()
		System.out.println("main over....");

	}

}
