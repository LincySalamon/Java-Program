package com.mockinterview;

public class FibanocciWithPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FibanocciWithPrime().findFibanocci();
	}

	private void findFibanocci() {
		int n1=0,n2=1;
		int n3;int i = 2;int count = 10;int primeCount = 0;
		System.out.println("Fibanocci numbers with a prime numbers are: ");
		while(primeCount < 10) 
		{
			n3=n1+n2;
			boolean isPrime = findPrime(n3);
			if(isPrime && n3!=1)
			{
				System.out.print(n3+"  "); 
				primeCount++;
			}
			n1=n2;
			n2=n3;
			i++;
		}
	}

	private boolean findPrime(int num) {
		int count = 0;
		int mid = num/2;
		for(int i=2;i<=mid;i++)
		{
			if(num%i == 0)
			{
				count = 1;  
				break; 
			}
		}
		if(count == 0)  
		{
			return true; 
		}
			
		return false;   
	}

}
