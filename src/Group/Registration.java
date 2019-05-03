
package Group;
public class Registration{
private	String email;
private	String userName;
	private String password;
	
	public void setEmail(String email) {
		if(email.contains("@gmail")) {
		this.email=email;}
	}
	public void setUserName(String userName) {
		if(!userName.isEmpty() && userName.length()>=6) {
		this.userName=userName;
	}else {
		System.out.println("USer name cannot be empty or characters cannot be less than 6");
	}
	}
	
	public void setPassword(String password) {
		if(!password.isEmpty() && password.length()>=6) {
			if(!password.contains(userName)) {
		this.password=password;
		}else {
			System.out.println("Password cannot be empty and contains user name");
		}
	}
	}
	public String getEmail() {
		return email;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
}