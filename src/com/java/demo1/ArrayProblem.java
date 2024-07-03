package com.java.demo1;

import java.util.HashMap;

public class ArrayProblem {
	
	public static void main(String[] args)
	{
		int arr[]= {1,5,7,-1,5,2,3,4};
		int k=6;
		HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = k - arr[i];

            // Check if the complement exists in the hash table
            if (map.containsKey(complement)) {
                System.out.println(arr[i] + " " + arr[map.get(complement)]);
            } else {
                // If not found, add the current element and its index to the hash table
                map.put(arr[i], i);
            }
        }
	}

}
