package utils;

import java.util.List;

import com.app.core.Cricketer;

import custom_exceptions.CricketerExceptionHandling;

public class CricketerUtils {
	public static Cricketer findCrickterByName(String name,List<Cricketer> list) throws CricketerExceptionHandling {
		Cricketer c1 = new Cricketer(name);
		int index = list.indexOf(c1);
		if(index==-1)
			throw new CricketerExceptionHandling("Crickter not found : Invalid Name");
		return list.get(index);
		
	}
}
