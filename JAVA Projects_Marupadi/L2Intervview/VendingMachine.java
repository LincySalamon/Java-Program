

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		new VendingMachine().provideCoolDrinks();
	}

	private void provideCoolDrinks() {
		Scanner sc = new Scanner(System.in);
		List<String> drinks = new LinkedList<String>();
		drinks.add("coke");
		drinks.add("pepsi");
		drinks.add("thumsup");
		drinks.add("fanta");
		List<Integer> amount = new LinkedList<Integer>();
		amount.add(8);
		amount.add(13);
		amount.add(10);
		amount.add(9);
		List<Integer> coin = new ArrayList<Integer>();
		coin.add(1);
		coin.add(2);
		coin.add(5);
		coin.add(10);
		boolean isTrue = true;

		while (isTrue) {
			System.out.println("Enter the drink needed: ");
			String choosedrink = sc.nextLine();
			int drinkAmount = 0;

			if (drinks.contains(choosedrink)) {
				drinkAmount = amount.get(drinks.indexOf(choosedrink));
			} else {
				System.out.println("Sorry!! " + choosedrink + " is not available");
				isTrue = false;
				break;
			}

			System.out.println("How many coins you have");
			int coincount = sc.nextInt();
			System.out.println("Enter coins: ");

			int[] userCoinVal = getCoinfromUser(coincount, coin);
			int sum = findSum(userCoinVal, coincount);
			boolean deliver = findamount(choosedrink, sum, drinkAmount, coin);

			if (deliver)
				isTrue = false;
		}

	}

	private int[] getCoinfromUser(int coincount, List<Integer> coin) {

		Scanner sc = new Scanner(System.in);
		int[] userCoinVal = new int[coincount];
		
		for (int i = 0; i < coincount; i++) {
			int val = sc.nextInt();
			if (coin.contains(val)) {
				userCoinVal[i] = val;
			} else {
				System.out.println("Invalid Coin!!!");
				System.out.println("Please insert valid coin");
				i--;
			}
		}
		return userCoinVal;
	}

	private int findSum(int[] userCoinVal, int coincount) {
		int sum = 0;
		for (int i = 0; i < coincount; i++) {
			sum += userCoinVal[i];
		}
		return sum;
	}

	private boolean findamount(String choosedrink, int sum, int drinkAmount, List<Integer> coin) {
		Scanner sc = new Scanner(System.in);
		if (sum >= drinkAmount) {
			int remaining = sum - drinkAmount;
			if (remaining != 0)
				System.out.println("Please collect your " + choosedrink + " and balance of Rs. " + remaining);
			else
				System.out.println("Please collect your " + choosedrink);
			return true;
		}
		if (sum < drinkAmount) {
			int balance = drinkAmount - sum;
			System.out.println("Not Enough Cash ! Please insert the remaining amount Rs. " + balance);
			System.out.println("Enter Extra coin");
			int extrasum = 0;
			System.out.println("How many coins you have");
			int coincount = sc.nextInt();
			System.out.println("Enter coins: ");
			int[] userCoinVal = getCoinfromUser(coincount, coin);
			extrasum = sum + findSum(userCoinVal, coincount);

			findamount(choosedrink, extrasum, drinkAmount, coin);
		}
		return true;
	}

}
