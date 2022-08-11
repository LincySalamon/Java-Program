package interview;

public class NearestPerfectSquare {

	public static void main(String[] args) {
		int n = 1500;
		getClosestPerfectSquare(n);
	}

	private static void getClosestPerfectSquare(int n) {
		if(isPerfect(n))
		{
			System.out.println(n);
			return;
		}
		int aboveNum = -1;
		int belowNum = -1;
		int nextNum;
		nextNum = n+1;
		while(true) 
		{
			if(isPerfect(nextNum))
			{
				aboveNum = nextNum;
				break;
			}
			else
				aboveNum++;
		}
		
		nextNum = n-1;
		while(true)
		{
			if(isPerfect(nextNum))
			{
				belowNum = nextNum;
				break;
			}
			else
				belowNum--;
		}
		
		int diff1 = aboveNum - n;
		int diff2 = n - belowNum;
		
		if(diff1 > diff2)
			System.out.println(belowNum);
		else
			System.out.println(aboveNum);
	}

	private static boolean isPerfect(int n) {
		if(Math.sqrt(n) - Math.floor(Math.sqrt(n)) != 0)
		{
			return false;
		}
		return true;
	}

}
