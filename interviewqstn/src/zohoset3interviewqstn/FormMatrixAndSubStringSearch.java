package zohoset3interviewqstn;

import java.util.Scanner;

public class FormMatrixAndSubStringSearch {

	public static void main(String[] args) {
		new FormMatrixAndSubStringSearch().formMatrix();
	}

	private void formMatrix() {
		Scanner sc = new Scanner(System.in);
		String str = "WELCOMETOZOHOCORPORATION";
		int n = 5;
		int len = str.length();
		char[][] chArr = new char[n][n];
		int index=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(index < len)
					chArr[i][j] = str.charAt(index++); 
				else
					break; 
			}
		}
		System.out.println("Given String in Matrix Form: ");
		matrixPrint(chArr); 
		System.out.println("Enter the word to search in matrix:");
		String searchWord = sc.nextLine();
		//top to bottom search
		int searchIndex = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(chArr[i][j] == searchWord.charAt(0)) 
				{
					if(i+searchWord.length() <= n)
					{
						for(int k=0;k<searchWord.length();k++)  
						{
							if(chArr[i+k][j] == searchWord.charAt(k)) 
							{
								searchIndex++;
							}
							
						}
					}
				}
			}
		}
		if((searchIndex == searchWord.length()))
			System.out.println("Given String "+searchWord+" is present in Top to Bottom");
		else
		{
			int indexsearch = 0;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(chArr[i][j] == searchWord.charAt(0)) 
					{
						if(j+searchWord.length() <= n)
						{
							for(int k=0;k<searchWord.length();k++)  
							{
								if(chArr[i][j+k] == searchWord.charAt(k)) 
								{
									indexsearch++;
								}
								
							}
						}
					}
				}
			}
			if((indexsearch == searchWord.length()))
				System.out.println("Given String "+searchWord+" is present in Left to Right");
			else
				System.out.println("Given String is not present in a matrix");
		}
		
	}
	private void matrixPrint(char[][] matrix) {
		// TODO Auto-generated method stub
		int n = matrix.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
