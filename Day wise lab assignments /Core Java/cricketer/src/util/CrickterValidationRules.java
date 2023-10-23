package util;

import java.util.HashMap;

import com.app.core.Cricketer;

import custom_exception.CrickterHandlingException;

public class CrickterValidationRules  {
public static void checkDups(String name,HashMap<String, Cricketer> crickMap)throws CrickterHandlingException {
	if(crickMap.containsKey(name)) {
		throw new CrickterHandlingException("Dupilcate Player Found");
		
	}
	System.out.println("No dulpcate Player Found");
}

//public static void checkRating(int rating, HashMap<String, Cricketer> crickMap)throws CrickterHandlingException{
//	if(crickMap.get)
//}

public static Cricketer validateAll(String name, int age, String email_id, String phone, int rating,HashMap<String, Cricketer>crickmap)throws CrickterHandlingException {
	checkDups(name, crickmap);
	
	return new Cricketer(name, age, email_id, phone, rating);
}

}
