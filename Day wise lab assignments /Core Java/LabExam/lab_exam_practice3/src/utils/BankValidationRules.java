package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class BankValidationRules {
	private static DateTimeFormatter formatter ;
	static{
		formatter = DateTimeFormatter.ofPattern("dd-MM-uuuu");
	}

	public static LocalDate parseAndValidateDate(String date) {
		return LocalDate.parse(date, formatter);
		
	}
}
