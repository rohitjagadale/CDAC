package com.app.core;

public class Order {
//	Order (orderId, petId, quantity, status)
//	Status is an enum with values like (PLACED, IN_PROCESS, COMPLETED)
//	Example: 
//	   orderId=1, petId=101, quantity=5, status=PLACED
	
	private int orderId;
	private int petId;
	private int quantity;
	private Status status;
	private static int idGenrator;
	
	static {
		idGenrator=100;
	}

	public Order(int petId, int quantity, Status status) {
		super();
		this.petId = petId;
		this.quantity = quantity;
		this.status = status;
		this.orderId=++idGenrator;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", petId=" + petId + ", quantity=" + quantity + ", status=" + status + "]";
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public static int getIdGenrator() {
		return idGenrator;
	}

	public static void setIdGenrator(int idGenrator) {
		Order.idGenrator = idGenrator;
	}
	
	
	
	
	
	
	
}
