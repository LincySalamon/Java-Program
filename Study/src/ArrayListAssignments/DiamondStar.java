package ArrayListAssignments;

public class DiamondStar {

	public static void main(String[] args) {
		new DiamondStar().printPattern();
	}

	private void printPattern() {
		int n = 7;
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n-1;i>=0;i--) 
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i*2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
