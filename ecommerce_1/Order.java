package ecommerce_1;

import pack_2.Customer;
import pack_2.Seller;

public class Order {

	private String orderId;
	private Customer user;
	private Seller seller;

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Customer getUser() {
		return user;
	}

	public void setUser(Customer user) {
		this.user = user;
	}

}
