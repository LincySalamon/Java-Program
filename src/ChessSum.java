import java.math.BigInteger;

public class ChessSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=64;
		long sum=0;
		BigInteger B;
		B = new BigInteger("0");
		for(int i=0;i<=n;i++)
		{
			sum += Math.pow(2, i);
		}
		System.out.println(sum);
	}

}
