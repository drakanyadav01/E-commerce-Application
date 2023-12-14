package pack_2;

public abstract class User {

	private String userId = "";
	private String passWord = "";

	abstract boolean verifyuser();

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public  String getUserId() {
		return userId;
	}
	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
