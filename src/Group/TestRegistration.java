
package Group;
public class TestRegistration{
	public static void main(String[] args) {
		Registration obj=new Registration();
		obj.setEmail("Tester@gmail.com");
		obj.setUserName("Syntax");
		obj.setPassword("test123456");
		
	System.out.println(	obj.getEmail());
	System.out.println(obj.getPassword());
	System.out.println(obj.getUserName());
	}
}