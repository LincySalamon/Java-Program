package interview;

public class NearestSqNumber {

	public static void main(String[] args) {
		new NearestSqNumber().findSquarNum();
	}

	private void findSquarNum() {
		int n = 1500;
		
		int above = -1; int below = -1;
		int nextNum;
		nextNum = n+1;
		while(true)
		{
			if(isPerfect(nextNum)) {
				above = nextNum;
				break;
			}
			else
				nextNum++;
		}
		nextNum = n-1;
		while(true)
		{
			if(isPerfect(nextNum)) {
				below = nextNum;
				break;
			}
			else
				nextNum--;
		}
		int diff1 = above - n;
		int diff2 = n - below;
		
		if(diff1>diff2)
			System.out.println(above);
		else
			System.out.println(below);
	}

	private boolean isPerfect(int nextNum) {
		int sqrt = (int)Math.sqrt(nextNum);
		if((sqrt * sqrt) == nextNum)
		{
			return true;
		}
		return false;
	}

//	private int findSqrt(int n) {
//		double t;
//		double sqrt = n/2;
//		do {
//			t=sqrt;
//			sqrt = (t+(n/t))/2;
//		}while((t-sqrt) != 0);
//		
//		return (int)sqrt;
//	}

}
