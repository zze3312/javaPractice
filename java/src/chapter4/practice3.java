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
		System.out.print("\n\n");
// 		 !!*
//		 !***
//		 *****
//		 !***
//		 !!*

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3 - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 2; i >= 1; i--) {
            for (int j = 1; j <= 3 - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.print("\n\n");

//      *****
//      !***
//      !!*
//      !***
//      *****
        for (int i = 3; i >= 1; i--) {
            for (int j = 1; j <= 3 - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 2; i <= 3; i++) {
            for (int j = 1; j <= 3 - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.println();
        }

        System.out.print("\n\n");
        
//      *!!!!!!*******
//      **!!!!!******
//      ***!!!!*****
//      ****!!!****
//      *****!!***
//      ******!**
//      ********
//      !!!!!!********
//      !!!!!**!******
//      !!!!***!!*****
//      !!!****!!!****
//      !!*****!!!!***
//      !******!!!!!**
//      *******!!!!!!*
        // 위쪽
        for (int i = 1; i <= 7; i++) {

            // 왼쪽 별
            for (int j = 1; j <= i; j++)
                System.out.print("*");

            // 가운데 공백
            for (int j = 1; j <= 7 - i; j++)
                System.out.print(" ");

            // 오른쪽 별
            for (int j = 1; j <= 8 - i; j++)
                System.out.print("*");

            System.out.println();
        }

        // 아래쪽
        for (int i = 1; i <= 7; i++) {

            // 왼쪽 공백
            for (int j = 1; j <= 7 - i; j++)
                System.out.print(" ");

            // 왼쪽 별
            for (int j = 1; j <= i; j++)
                System.out.print("*");

            // 가운데 공백
            for (int j = 1; j <= i - 1; j++)
                System.out.print(" ");

            // 오른쪽 별
            for (int j = 1; j <= 8 - i; j++)
                System.out.print("*");

            System.out.println();
        }
	}

}
