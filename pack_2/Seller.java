package pack_2;

import ecommerce_1.Cart;
import pack_1.Product;

public class Seller extends User{

	private Product[] productListed;
	private Cart cart;
	public Product[] getProductListed() {
		return productListed;
	}

	public void setProductListed(Product[] productListed) {
		this.productListed = productListed;
	}

	public boolean verifyuser() {

		return true;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
}
