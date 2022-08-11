package com.mockinterview;

import java.util.ArrayDeque;
import java.util.Deque;

class Fourte
{
	// Count ways to calculate a target from elements of a specified array
	public static int countWays(int[] nums, int n, int target)
	{
		if (target == 0) {
			return 1;
		}

		if (n < 0) {
			return 0;
		}

		int exclude = countWays(nums, n - 1, target);
		int include = countWays(nums, n - 1, target - nums[n]) +
					countWays(nums, n - 1, target + nums[n]);          
		
		return exclude + include;
	}

	public static void main(String[] args)
	{
		int[] nums = {9,8,5,2};  
		int target = 14; 

		System.out.println(countWays(nums, nums.length - 1, target) + " ways");
	}
}