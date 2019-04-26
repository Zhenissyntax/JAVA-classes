
package HomeWorks;
class A{
	  A(){
	    System.out.println(10);
	  }
	}
	class B extends A{
	  B(){
	    System.out.println(20);
	  }
	}
	class C extends B{
	  C(){
	    System.out.println(30);
	  }
	}

	class Main {
	  public static void main(String[] args) {
	    C For=new C();
	  }
	}