package pack_1;

public class Catalog {

	private Product[] listofProducts;
	public Product[] getListofProducts() {
		
		Product product1=new Product();
		 product1.setProductId("1");
	     product1.setProductName("product1");
		 product1.setProductCost("500");
		 
	   Product product2=new Product();
	      product2.setProductId("2");
	      product2.setProductName("product2");
		  product2.setProductCost("200");
		  
		  listofProducts=new Product[2];
		 listofProducts[0]=product1;
		 listofProducts[1]=product2;;
		 
		 
		return listofProducts;
	}

	public void setListofProducts(Product[] listofProducts) {
		this.listofProducts = listofProducts;
	}

}
