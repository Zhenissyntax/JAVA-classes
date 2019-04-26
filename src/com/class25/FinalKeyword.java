
package com.class25;
public class FinalKeyword{
	public static final String name="Syntax";
	public static void main(String[] args) {
		
	
	/*Can be used in 3 ways
	 * 1 variables  - we CANNOT change their value---->CONSTANT
	 * 2 methods--- we CANNOT OVERRIDE FINAL METHODS
	 * 3 classes---WE CANNOT  CREATE A CHILD OF A FINAL CLASS---->PREVENT INHERITANCE
	 *
	 */
	
	final String str="Hello";
	//str="john";
}
	public final void hello() {
		System.out.println("Hello from Parent class");
	}
}

class ChildOfFinal extends FinalKeyword{
	//public void final hello() {                         ----->>WE CANNOT OVERRAIDE FINAL METHODS
//}
}