package com.shop.utils;

import java.util.List;
import java.util.Map;

import com.shop.core.Order;
import com.shop.core.Pet;
import com.shop.customExceptions.ShopCustomExceptions;


public class OrderExceptionHandling {

	public static void checkIDExists(int id, Map<Integer, Pet> map) throws ShopCustomExceptions
	{
		if(!map.containsKey(id))
			throw new ShopCustomExceptions("Pet ID does not Exists!");
	}
	
	
	public static Order checkOrder(int orderID, List<Order> list) throws ShopCustomExceptions
	{
		Order od = new Order(orderID);
		if(!list.contains(od))
			throw new ShopCustomExceptions("No such Order Placed!");
		
		return list.get(list.indexOf(od));
		
		
	}
	
	public static void checkQuantity(int quant, Map<Integer, Pet> map,int id) throws ShopCustomExceptions
	{
		if(map.get(id).getStocks()<quant)
			throw new ShopCustomExceptions("Not Enough Stocks! Sorry!");
	}
	
	public static Order validateOrder(int id, int quantity, List<Order> list, Map<Integer, Pet> map) throws ShopCustomExceptions
	{
		checkIDExists(id, map);
		checkQuantity(quantity, map, id);
		Order obOrder =  new Order(id, quantity);
		System.out.println("\nOrder Placed!\n Order ID: "+obOrder.getOrderId());
		return obOrder;
	}
	
}
