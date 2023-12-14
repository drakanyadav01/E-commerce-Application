package ecommerce_1;

import pack_1.Product;

public class Cart {

	private String cartId;
	private Product[] listofProducts;

	public Product[] getListofProducts() {
		return listofProducts;
	}

	public void setListofProducts(Product[] listofProducts) {
		this.listofProducts = listofProducts;
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

}
