package starpatternpractice;

public class AllStar {
	public static void main(String[] args) {
		// 1)
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		// 2)
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		// 3)
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		// 4)
		for (int i = 1; i <= 4; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 4; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		// 5)
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		// 6)
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 3; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		// 7)
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 3; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 3; k >= i; k--) {
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		// 8)
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >=i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
