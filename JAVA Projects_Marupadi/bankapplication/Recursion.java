package com.bankapplication;

import java.util.Scanner;

public class Recursion {
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
		boolean result = Recursion.recursion(index, array, size, target);

	}

	private static boolean recursion(int index, int[] array, int size, int target) {

		boolean b = false;
		for (int j = index + 1; j < size; j++) {
			if (array[index] + array[j] == target) {
				b = true;
				break;
			}
		}
		if (b == true) {
			return b;
		} else if(index<size){
			recursion(index++, array, size, target);
		}
		return b;
		
	}
}
