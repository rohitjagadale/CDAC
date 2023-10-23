package com.shop.utils;

import com.shop.customExceptions.ShopCustomExceptions;
import static com.shop.tester.Tester.*;

import com.shop.core.Admin;
import com.shop.core.Customer;

import static com.shop.core.Admin.*;
import static com.shop.core.Customer.*;

public final class Login {

	
	
	
	public static void checkLoginAdmin() throws ShopCustomExceptions
	{
		if(loginObject == null)
			throw new ShopCustomExceptions("Login as Admin First!");
		if(loginObject instanceof Customer)
			throw new ShopCustomExceptions("Customer can't Access Admin Rights!");
	}
	
	public static void checkLoginCustomer() throws ShopCustomExceptions
	{
		if(loginObject == null)
			throw new ShopCustomExceptions("Login as Customer First!");
		if(loginObject instanceof Admin)
			throw new ShopCustomExceptions("Admin can't Place Orders!");
	}
	
	
	public static void validateLogin(String id,String pass) throws ShopCustomExceptions
	{
		if(id.equals(getAdminID()) && pass.equals(getAdminPass()))
			loginObject = new Admin();
		else if(id.equals(getCustID()) && pass.equals(getCustPass()))
			loginObject = new Customer();
		else
			throw new ShopCustomExceptions("Credentials are Wrong!");
	}
	

}
