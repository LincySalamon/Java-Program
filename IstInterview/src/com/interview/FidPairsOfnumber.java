package com.interview;

import java.util.Arrays;
import java.util.Scanner;

public class FidPairsOfnumber {

	public static void main(String[] args) {
		new FidPairsOfnumber().findPairs();
	}

	private void findPairs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an Array:");
		int len = sc.nextInt();
		int[] numbers = new int[len];
		System.out.println("Enter the elements in an array");
		int index = 0;
		
		while(index<len)
		{
			numbers[index++] = sc.nextInt();
		}
		printArray(numbers);
		//sorting elements in an array
		Arrays.sort(numbers);
		System.out.println("After sorting");
		printArray(numbers);
		double mean = findMean(numbers);
		double median = findMedian(numbers);
		System.out.println("Mean"+mean+"     "+"Median"+median);
		findPairOfNumber(numbers,mean,median);
	}

	private void findPairOfNumber(int[] numbers, double mean, double median) {
		int len = numbers.length;
		int count = 0; 
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++) 
			{
				double sumVal = numbers[i]+numbers[j];
				if(sumVal > (int)median && sumVal < (int)mean)
				{
					System.out.print("("+numbers[i]+","+numbers[j]+")"); 
					count++;
				}
			}
		}
		if(count == 0)
		{
			System.out.println("("+")");
		}
		
	}

	private double findMedian(int[] numbers) {
		int len = numbers.length;
		double median = 0;
		
		if(len%2!=0)
		{
			median = numbers[len/2];
			System.out.println(len/2+1);
		} 
		else {
			int middle = numbers[len/2-1]+numbers[len/2];
			median = middle/2.0;
		}
		
		return median;
	}

	private double findMean(int[] numbers) {
		double len = numbers.length;
		double sum = 0;
		for(int i=0;i<len;i++)
		{
			sum += numbers[i];
		}
		double mean = sum/len;
		return mean;
	}

	private void printArray(int[] numbers) {
		int len = numbers.length;
		for(int i=0;i<len;i++)
		{
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
	}

}
