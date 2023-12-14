package pack_2;

import ecommerce_1.Cart;

public class Customer extends User{

	private Cart cart;

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public boolean verifyuser() {
		return true;
	}
}
