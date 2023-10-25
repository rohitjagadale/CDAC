package utils;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import static utils.ItemValidationRules.sdf;
import com.app.items.Item;

public class ItemUtils {

	public static Map<String,Item> populateItems() throws ParseException {
		Map<String,Item> itemMap = new HashMap<>();
		itemMap.put("123abc",new Item("123abc", "Table", 15000, sdf.parse("2020-12-23")));
		itemMap.put("124abc",new Item("124abc", "Chair", 5000, sdf.parse("2023-10-13")));
		itemMap.put("111abc",new Item("111abc", "Fan", 12000, sdf.parse("2021-06-20")));
		itemMap.put("123xyz",new Item("123xyz", "Sofa", 20000, sdf.parse("2020-11-30")));
		itemMap.put("199jkl",new Item("199jkl", "Wadrobe", 25000, sdf.parse("2022-04-17")));
		return itemMap;
	}
}
