
package HomeWorks;
public class implementation{
}
class Main implements MyInterface1 , MyInterface2 {
	 public void  m(){
	    System.out.println("method1 implementing multiple Inheritance");
	  }
	  public void k(){
	    System.out.println("method2 implementing multiple Inheritance");}
	  
	  
	  public static void main(String[] args) {
	    Main obj= new Main();
	    obj.m();
	    obj.k();
	   
	    
	  }
	}
	interface MyInterface1{
	  public void m();
	}

	interface MyInterface2{
	public void   k();
	}