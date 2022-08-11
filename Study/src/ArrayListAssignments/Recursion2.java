package ArrayListAssignments;

import java.util.Scanner;

public class Recursion2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("Enter array elements");
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter target value");
		int target = sc.nextInt();
		int index = 0;
		boolean result = Recursion2.recursion(index, array, size, target);
		System.out.println(result);

	}

	private static boolean recursion(int index, int[] array, int size, int target) {

		boolean b = false;
		for (int j = index + 1; j < size; j++) {
			if (array[index] + array[j] == target) {
				return true;
			}
		}
		System.out.println(index);
		System.out.println(size);
		index = index + 1;
		if (index < size) {
			// index = index + 1;
			recursion(index, array, size, target);
		}

		return b;

	}
}
