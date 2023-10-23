package utils;

import static java.time.LocalDate.parse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.core.Brand;
import com.app.core.Material;
import com.app.core.Pen;

public class PenUtils {
	public static Map<Integer,Pen> populatePenMap(){
		Map<Integer,Pen> penMap = new HashMap<>();
		penMap.put(101,new Pen(Brand.CELLO, "Red", "Blue", Material.METAL, 20, parse("2023-05-22"), 100));
		penMap.put(102,new Pen(Brand.REYNOLDS, "Green", "Black", Material.PLASTIC, 35, parse("2023-09-12"), 150));
		penMap.put(103,new Pen(Brand.PARKER, "White", "Black", Material.ALLOYSTEEL, 50, parse("2022-10-11"), 200));
		
		return penMap;
	}
}
