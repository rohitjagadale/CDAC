package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.app.items.Item;

import custome_exception.ItemHandlingExceptions;

public class ItemValidationRules {
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("yyyy-MM-dd");
	}
	
	public static void checkDupItemCode(String iCode, Map<String,Item> itemMap ) throws ItemHandlingExceptions {
		boolean check = itemMap.containsKey(iCode);
		if(check) {
			throw new ItemHandlingExceptions("Duplicate itemCode found!!");
		}
		System.out.println("No duplicates");
	}
	
	public static Date validateShippingDate(String date) throws ParseException {
		return sdf.parse(date);
	}
}
