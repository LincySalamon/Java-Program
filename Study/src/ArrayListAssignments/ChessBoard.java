package ArrayListAssignments;

import java.util.Scanner;

public class ChessBoard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[200];
		System.out.println("Enter the no of positions");
		int n = sc.nextInt();
		System.out.println("Enter chessBoard size");
		int chessSize = sc.nextInt();
		System.out.println("Enter positions");
		for (int i = 0; i < n * 2; i++) {
			array[i] = sc.nextInt();
		}

		new ChessBoard().countOfPositions(array, n * 2, chessSize);
	}

	private void countOfPositions(int[] array, int l, int chessSize) {

		int i = 0, j = 0, noOfrooks = 0;
		boolean rowColoum = true;
		for (i = 0; i < chessSize; i++) {

			for (j = 0; j < chessSize; j++) {
				rowColoum = true;
				for (int k = 0; k < l - 1; k++) {

					if (i == array[k] || j == array[++k]) {

						rowColoum = false;
						break;
					}

				}
				if (rowColoum == true) {
					array[l] = i;
					array[l + 1] = j;
					l = l + 2;
					System.out.println(i + " " + j);
					noOfrooks++;
				}

			}

		}
		System.out.println("Total no of positions of the remining rooks " + noOfrooks);

	}

}
