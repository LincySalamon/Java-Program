package com.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class QueenAttack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> obs = new ArrayList<List<Integer>>(); 
		obs.add(new ArrayList<Integer>());
		obs.get(0).add(0,5);
		obs.get(0).add(1,5); 
		obs.add(new ArrayList<Integer>(Arrays.asList(4,2)));
		obs.add(new ArrayList<Integer>(Arrays.asList(2,3)));
		System.out.println(obs);
		int n = 5;int k = 3; int r_q = 4; int c_q = 3;
		
		/*long ans = 0;
		for(int i = c_q-1;i>=1;i--)
		{
			if(obs.get(r_q).contains(i))
			{
				break;
			}
			ans++;
		}
		System.out.println(ans);*/
		HashMap<Integer, HashSet<Integer>> refVal = new HashMap<>();
		for(int i=0;i<obs.size();i++)
		{
			/*if(refVal.containsKey(obs.get(i).get(0)))
			{
				refVal.get(obs.get(i).get(0)).add(obs.get(i).get(1));
			}
			else
			{*/
				refVal.put(obs.get(i).get(0), new HashSet<Integer>());
				refVal.get(obs.get(i).get(0)).add(obs.get(i).get(1));
			//}
		}
		HashMap<Integer, Integer> val = new HashMap<Integer, Integer>();
		
		for(int i=0;i<obs.size();i++)
		{
			val.put(obs.get(i).get(0), obs.get(i).get(1));
		}
		
		
		System.out.println(val);
		int count = 0;
		for(int i = c_q+1;i<=n;i++)//right from queen
		{
			int value = val.get(r_q);
			//System.out.println(value);
			if(val.containsKey(r_q) && value == i) 
			{
				break;
			}count++; 
			
		}System.out.println(count);
		for(int i=c_q-1;i>=1;i--)//left from queen
		{
			int value = val.get(r_q);
			if(val.containsKey(r_q) && value == i)
			{
				break;
			}count++;
		}System.out.println(count);
		for(int i = r_q+1;i<=n;i++)//up to queen
		{
			int value = val.get(r_q);
			if(val.containsKey(r_q) && value == i)
			{
				break;
			}count++;
		}System.out.println(count);
		for(int i = r_q-1;i>0;i--)//down to queen
		{
			int value = val.get(r_q);
			if(val.containsKey(r_q) && value == i)
			{
				break;
			}count++;
		}System.out.println(count);
		//left up
		for(int i=r_q+1,j=c_q-1;i<=n && j>0;i++,j--)
		{
			int value = val.get(r_q);
			if(val.containsKey(r_q) && value == j)
			{
				break;
			}count++;
		}System.out.println(count+"checked");
		//left down
		for(int i=r_q-1,j=c_q-1;i>=1 && j>=1;i--,j--)
		{
			int value = val.get(r_q);
			if(val.containsKey(r_q) && value == j)
			{
				break;
			}count++;
		}System.out.println(count);
		//right up
		for(int i=r_q+1,j=c_q+1;i<=n && j<=n;i++,j++)
		{
			int value = val.get(r_q);
			if(val.containsKey(r_q) && value == j)
			{
				break;
			}count++;
		}System.out.println(count);
		//right down
		for(int i=r_q-1,j=c_q+1;i>=1 && j<=n;i--,j++)
		{
			int value = val.get(r_q);
			if(val.containsKey(r_q) && value == j)
			{
				break;
			}count++;
		}
		System.out.println(count);
	} 

}
