
package HomeWorks;
class Encapsulation{
	
}
class EncapsulationDemo{
	  private String empName="John";
	  private int empAge=30;
	  public void setName(String name){
	  this.empName=name;}
	  public void setAge(int age){
	    this.empAge=age;}
	  public String getName(){
	    return empName;
	  }
	  public int getAge(){
	    return empAge;
	  }
	}
	class Main   {
	  public static void main(String[] args) {
		  EncapsulationDemo  obj=new EncapsulationDemo();
	    
	    
	  }
	}