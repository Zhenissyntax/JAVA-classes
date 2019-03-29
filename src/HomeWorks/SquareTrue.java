package HomeWorks;
public class SquareTrue {
	public static void main(String[] args) {
		
		
		int[][] a = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
			};
	
boolean flag = false;
        
        for (int i = 0; i < a.length; i++) {
            if (a.length == a[i].length){
                flag = true;
            }
            break;
        }
        System.out.println(flag);
	
	}
}

		
		