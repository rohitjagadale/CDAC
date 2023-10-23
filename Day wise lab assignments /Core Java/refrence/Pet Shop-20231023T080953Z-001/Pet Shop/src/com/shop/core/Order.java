package com.shop.core;

public class Order {

	int orderId;
	int petId;
	int quantity;
	Status status;
	static int orderIdGenerator = 0;
	
	public Order(int petId, int quantity)
	{
		super();
		this.orderId = ++orderIdGenerator;
		this.petId = petId;
		this.quantity = quantity;
		this.status = Status.PLACED;
		
	}
	
	public Order(int id)
	{
		orderId = id;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return this.orderId == ((Order)obj).orderId;
	}
	

	@Override
	public String toString()
	{
		return "Order [orderId=" + orderId + ", petId=" + petId + ", quantity=" + quantity + ", status=" + status + "]";
	}



	public int getOrderId()
	{
		return orderId;
	}

	public void setOrderId(int orderId)
	{
		this.orderId = orderId;
	}

	public int getPetId()
	{
		return petId;
	}

	public void setPetId(int petId)
	{
		this.petId = petId;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public Status getStatus()
	{
		return status;
	}

	public void setStatus(Status status)
	{
		this.status = status;
	}
	
	
	
	
	
}
