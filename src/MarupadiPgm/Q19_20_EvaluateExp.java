package MarupadiPgm;

public class Q19_20_EvaluateExp {
	public static void main(String[] args) {
		int a=28;
		a+=a++ + ++a + -a + a;
		System.out.println(a);
		int x=10;
		x = x++ * 2 + 3 * (-x);
		System.out.println(x);
	}
}
