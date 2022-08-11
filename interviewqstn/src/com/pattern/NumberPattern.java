package com.pattern;

public class NumberPattern {

	public static void main(String[] args) {
		new NumberPattern().printNumberPattern();
	}

	private void printNumberPattern() {
		int num = 5;
		int x = 1, y, t;

		for (int i = num; i > 0; i--) {
			y = i;
			t = x;
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}

			for (int k = num; k >= i; k--) {
				System.out.print(t);
				t = t - y;
				y++;
			}
			x = x + i;
			System.out.println();
		}
	}

}