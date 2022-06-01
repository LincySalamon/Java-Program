package MarupadiPgm;

public class Q21_23_expressionEval {
	public static void main(String[] args) {
		int y = 10,x = 5;
		int z = (++y * (y++ + 5));
		int x1 = ++x -x++ + -x;
		System.out.printf("%d,%d\n",z,x1);
	}
}
