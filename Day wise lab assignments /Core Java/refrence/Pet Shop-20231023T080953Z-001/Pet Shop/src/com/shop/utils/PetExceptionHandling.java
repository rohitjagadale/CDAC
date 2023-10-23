package com.shop.utils;

import java.util.Map;

import com.shop.core.Category;
import com.shop.core.Pet;
import com.shop.customExceptions.ShopCustomExceptions;

public class PetExceptionHandling {
	
	public static void checkID(int id, Map<Integer, Pet> list) throws ShopCustomExceptions
	{
		if(list.containsKey(id))
			throw new ShopCustomExceptions("Pet ID already Exists!");
	}

	public static Category categoryCheck(String category) throws IllegalArgumentException
	{
		return Category.valueOf(category.toUpperCase());
	}
	
	public static Pet validatePetAll(Map<Integer, Pet> list, int petId, String name, String category, double unitPrice, int stocks) throws IllegalArgumentException,ShopCustomExceptions
	{
		checkID(petId, list);
		Category cat = categoryCheck(category);
		return new Pet(petId, name, cat, unitPrice, stocks);
	}
	
}
