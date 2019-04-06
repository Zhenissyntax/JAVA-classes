package com.class17version2;
public class LoopArray {
	public static void main(String[] args) {
	    /*I want to print pattern
         * 1111111 --> rows=7, columns=7
         * 2222222
         * 3333333
         * 4444444
         * 5555555
         * 6666666
         * 7777777
         */
        
        for (int i=1; i<=7; i++) {
            
            for (int y=1; y<=7; y++) {
                System.out.print(i);//1111111 //2222222
            }
            System.out.println();
        }
      /*54321
       * 54321
       *54321
       * 54321
       */
	for (int i=1; i<5; i++) {
		for (int y=5; y>=1; y--) {
			System.out.print(y);
		}System.out.println();
	}

	
	
	
	
	
	}

	}
