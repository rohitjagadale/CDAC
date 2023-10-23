package utils;

import java.time.LocalDate;
import java.util.Map;

import com.app.core.Brand;
import com.app.core.Material;
import com.app.core.Pen;

import custom_exceptions.PenHandlingExceptions;

public class PenValidatationRules {
	
//	public static void checkDupId(int id, Map<Integer,Pen> pens) throws PenHandlingExceptions {
//		if(pens.containsKey(id)) {
//			throw new PenHandlingExceptions("Duplicate pen id detected ");
//		}
//		System.out.println("No duplicates");
//	}
	
	public static Brand parseAndValidateBrand(String brands) {
		return Brand.valueOf(brands.toUpperCase());
	}
	
	public static Material parseAndValidateMaterial(String materials) {
		return Material.valueOf(materials.toUpperCase());
	}
	
	public static LocalDate parseDate(String date) {
		return LocalDate.parse(date);
	}
	
	public static Pen validateAll(String brands, String color, String inkColor, String materials,int stock,
			String listingDate,double price) {
		
				Brand brand = parseAndValidateBrand(brands);
				Material material = parseAndValidateMaterial(materials);
				LocalDate stockListingDate = parseDate(listingDate);
				return new Pen(brand,color,inkColor,material, stock,stockListingDate,price);
		
	}
}
