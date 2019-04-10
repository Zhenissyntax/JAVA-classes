package HomeWorks;
public class MixTwoValues {
	static String mixString(String s1, String s2)
	{
		for(int i=0; i<=s1.length()-1;i++) {
			
				s1.charAt(i);
				s2.charAt(i);
		 String mixed=mixed+(s1.charAt(i)+s2.charAt(i));
			}
			
			
			return mixed ;
		}
	  
		
	

	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(mixString("12345","abcde")); //should be 1a2b3c4d5e
		System.out.println(mixString("howdy","hello")); //should be hhoewldlyo
	
	}	
	
}