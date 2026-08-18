package javaprograms;


	public class StarTriangle {
		
		    public static void main(String[] args) {

		        // 1. Right Triangle
		        System.out.println("1. Right Triangle");

		        for (int i = 1; i <= 5; i++) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }


		        // 2. Inverted Right Triangle
		        System.out.println("\n2. Inverted Right Triangle");

		        for (int i = 5; i >= 1; i--) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }


		        // 3. Pyramid Triangle
		        System.out.println("\n3. Pyramid Triangle");

		        for (int i = 1; i <= 5; i++) {

		            for (int j = 5; j > i; j--) {
		                System.out.print(" ");
		            }

		            for (int j = 1; j <= i; j++) {
		                System.out.print("* ");
		            }

		            System.out.println();
		        }


		        // 4. Inverted Pyramid
		        System.out.println("\n4. Inverted Pyramid");

		        for (int i = 5; i >= 1; i--) {

		            for (int j = 5; j > i; j--) {
		                System.out.print(" ");
		            }

		            for (int j = 1; j <= i; j++) {
		                System.out.print("* ");
		            }

		            System.out.println();
		        }
		    }
		}
	

