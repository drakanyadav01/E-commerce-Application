package pack_1;

public class Category {

	private	String catagoryName;
	private	Category[] subCatagories;

	public String getCatagoryName() {
		return catagoryName;
	}

	public void setCatagoryName(String catagoryName) {
		this.catagoryName = catagoryName;
	}

	public Category[] getSubCatagories() {
		return subCatagories;
	}

	public void setSubCatagories(Category[] subCatagories) {
		this.subCatagories = subCatagories;
	}
	
}
