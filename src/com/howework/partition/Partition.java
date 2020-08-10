package com.howework.partition;

import java.util.ArrayList;
import java.util.List;

public class Partition {
	
	
	/**
	 * @param numbers [ List of Numbers ]
	 * @param size [ Number of items by subList ]
	 * @return [ An arrayList of SubList ]
	 */
	public static List partition(List<Integer> numbers, int size) {
		
		List<List<Integer>> listNumbers = new ArrayList<>();
		List<Integer> nb = new ArrayList<>();
		int limit = numbers.size();

		
		
		for (int i = 0 ; i < limit ; i++) {
			
			if(nb.size() < size) {
				nb.add(numbers.get(i));
				
				if (i == (limit-1)) 
					listNumbers.add(nb);
				
			} else {
				listNumbers.add(nb);
				nb = new ArrayList<>();
				nb.add(numbers.get(i));
				if (i == (limit-1)) 
					listNumbers.add(nb);
			}
			
		}
		return listNumbers;
		
	}

}
