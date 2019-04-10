
package HomeWorks;
class Method {
	static String makeThreeSubstr(String word , int startIndex,int endIndex)
	{
	  for (int i=0; i<=word.length()-1; i++){
		
	      word.charAt(i);
	     word.charAt(i);
	      
	    }
	    return word.substring(startIndex,endIndex)+word.substring(startIndex,endIndex)+word.substring(startIndex,endIndex);
	  
	  }
		
	
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(makeThreeSubstr("hello",0,2)); //should be hehehe
		System.out.println(makeThreeSubstr("shenanigans",3,7)); //should be naninaninani
	}
}