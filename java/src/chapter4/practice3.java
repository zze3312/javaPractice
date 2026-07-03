package chapter4;

public class practice3 {

	public static void main(String[] args) {
		
//		*
//		**
//		***
//		****
//		*****
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.print("\n\n");
		
//		*****
//		****
//		***
//		**
//		*
		for(int i = 5; i > 0; i--) {
			for(int j = 1; j <= i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.print("\n\n");
		
//	    !!!!*
//	    !!!***
//	    !!*****
//	    !*******
//	    *********
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j <= 4 - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.print("\n\n");
		
//		*********
//		!*******
//		!!*****
//		!!!***
//		!!!!*
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*(4 - i)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
// 		 !!*
//		 !***
//		 *****
//		 !***
//		 !!*

	}

}
