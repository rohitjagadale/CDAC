package com.shop.utils;

import java.util.Map;

import com.shop.core.Pet;
import com.shop.customExceptions.ShopCustomExceptions;
import static com.shop.utils.PetExceptionHandling.categoryCheck;

public class BasicFunctionality {
	
	public static Pet checkPet(Map<Integer, Pet> list,int id) throws ShopCustomExceptions
	{
		if(!list.containsKey(id))
			throw new ShopCustomExceptions("No such Pet ID Exists!");
		
		return list.get(id);
	}
	
	public static void updatePet(String name, String Category, double price, int stock , Pet pet)
	{
		pet.setName(name);
		pet.setStocks(stock);
		pet.setUnitPrice(price);
		pet.setCategory(categoryCheck(Category));
	}

}
