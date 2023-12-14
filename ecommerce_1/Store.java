package ecommerce_1;

import java.util.Scanner;
import pack_2.Admin;
import pack_2.Customer;
import pack_2.Seller;
import pack_1.Catalog;
import pack_1.Product;
public class Store {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the E-commerce store");
		System.out.println("Which type of user are you \n1.Customer \n2.Seller \n3.Admin");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		String typeofUser;
		if (choice == 1) {
			typeofUser = "customer";
			Customer current = new Customer();
			System.out.println("Enter your user Id");
			sc.nextLine();
			current.setUserId(sc.nextLine());
			System.out.println("Enter your password");
			current.setPassWord(sc.nextLine());
			if (current.verifyuser() == true) {
				System.out.println("User varified");
				while (true) {
					System.out.println("do you want to \n1.View products \n2.View cart \n3.Contact us \n4.Exit");
					choice = sc.nextInt();
					if (choice == 1) {
						Catalog catalog = new Catalog();
						Product[] allproducts = catalog.getListofProducts();
						for (int i = 0; i < allproducts.length; i++) {
							System.out.println(allproducts[i].getProductName() + " " + allproducts[i].getProductId()
									+ " " + allproducts[i].getProductCost());
						}
						System.out.println("Do you want to add any product in the cart: Y/N");
						sc.nextLine();
						String addtoCart = sc.nextLine();
						if (addtoCart.equalsIgnoreCase("y")) {
							System.out.println("Input the id of the product which you wanted to add to your cart");
							String productid = sc.nextLine();
							Product[] cartproducts = new Product[1];
							for (int i = 0; i < allproducts.length; i++) {
								if (allproducts[i].getProductId().equals(productid))
									cartproducts[0] = allproducts[i];
							}
							Cart cart = new Cart();
							cart.setCartId("1");
							cart.setListofProducts(cartproducts);
							current.setCart(cart);
							System.out.println("Product is successfully added to the cart...");
						}
					}

					// this is for view cart
					else if (choice == 2) {
						Product[] cartproducts = current.getCart().getListofProducts();
						for (int i = 0; i < cartproducts.length; i++) {
							System.out.println(cartproducts[i].getProductName() + " " + cartproducts[i].getProductId()
									+ " " + cartproducts[i].getProductCost());
						}
					} else if (choice == 3) {
						System.out.println("Contact us on storeworld324@gmail.com");
					} else if (choice == 4) {
						break;
					} else {
						System.out.println("Choice is invalid plese try again");
					}
				} // brace for while loop

			}

		} else if (choice == 2) {
			typeofUser = "seller";
			// checking for authentication
			Seller current = new Seller();
			System.out.println("Enter your user Id");
			sc.nextLine();
			current.setUserId(sc.nextLine());
			System.out.println("Enter your Password");
			current.setPassWord(sc.nextLine());
			if (current.verifyuser() == true) {
				System.out.println("User Verified");

				while (true) {
					System.out.println("Do you want to \n1-view products  \n2-Add products \n3-Exit");
					choice = sc.nextInt();
					// view products
					if (choice == 1) {
						Catalog catalog = new Catalog();
						Product[] allproducts = catalog.getListofProducts();
						for (int i = 0; i < allproducts.length; i++) {
							System.out.println(allproducts[i].getProductName() + " " + allproducts[i].getProductId()
									+ " " + allproducts[i].getProductCost());
						}

					} else if (choice == 2) {
						Catalog catalog = new Catalog();
						Product[] allproducts = catalog.getListofProducts();
						System.out.println("Input the id of the product which you wanted to add to your cart");
						sc.nextLine();
						String productid = sc.nextLine();
						Product[] cartproducts = new Product[1];
						for (int i = 0; i < allproducts.length; i++) {
							if (allproducts[i].getProductId().equals(productid))
								cartproducts[0] = allproducts[i];
						}
						Cart cart = new Cart();
						cart.setCartId("1");
						cart.setListofProducts(cartproducts);
						current.setCart(cart);
						System.out.println("Product is successfully added to the cart");

					} else if (choice == 3) {
						break;
					} else {
						System.out.println("Invalid choice plese try after some time");
					}
				}

			}
		} else if (choice == 3) {
			// Admin is only desired to authenticate and view products
			typeofUser = "admin";
			Admin current = new Admin();
			// here we are checking that user is admin or not
			System.out.println("Enter your user Id");
			sc.nextLine();
			current.setUserId(sc.nextLine());
			System.out.println("Enter your Password");
			current.setPassWord(sc.nextLine());
			if (current.verifyuser() == true) {
				while (true) {
					System.out.println("Do you want to \n1-view products \n2-exit");
					choice = sc.nextInt();
					if (choice ==1){
						Catalog catalog = new Catalog();
						Product[] allproducts = catalog.getListofProducts();
						for (int i = 0; i < allproducts.length; i++) {
							System.out.println(allproducts[i].getProductName() + " " + allproducts[i].getProductId()
									+ " " + allproducts[i].getProductCost());
						}
					}
					else if (choice == 2) {
                               break;
					} else {
                       System.out.println("Invalid choice");
					}
				}
			}

		} else {
			System.out.println("Invalid choice plese try a bit letter");
		}

	}
}
