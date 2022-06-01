
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5, y = 2, exp = 10;

		exp %= x + ( x > 6 ? ++y : --y);

		System.out.println("exp = " +exp);
	}

}
