package com.stackQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args)
	{
        Queue<String> testStringsPQ = new PriorityQueue<>();
        testStringsPQ.add("abcd");
        testStringsPQ.add("1234");
        testStringsPQ.add("23bc");
        testStringsPQ.add("zzxx");
        testStringsPQ.add("abxy");

        System.out.println("Strings Stored in Natural Ordering in a Priority Queue\n");
        while (!testStringsPQ.isEmpty()) {
            System.out.println(testStringsPQ.poll());
        }

	}

}
