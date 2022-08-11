package ArrayListAssignments;

import java.util.Scanner;

public class Pattern {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		new Pattern().pattern();

	}

	private void pattern() {
		System.out.println("Enter value of n");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
