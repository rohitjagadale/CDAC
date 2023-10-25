package utils;

import java.util.Map;

import com.app.stocks.Stock;

import custom_exception.StockHandlingException;

public class StockValidationRules {
	public void checkDupStockId(String sId, Map<String,Stock> stockMap) throws StockHandlingException {
		if(stockMap.containsKey(sId))
			throw new StockHandlingException("Duplicate stock id found");
		System.out.println("No Duplicates!!!");
	}

}
