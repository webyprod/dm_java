package com.howework.partition;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PartitionTest {
	
	List<List<Integer>> listNumbers;
	List<Integer> subList;
		
	@Before
	public void init() {
		subList = new ArrayList<>();
		for (int i = 1 ; i <= 10 ; i++) {
			subList.add(i);
		}
	}

	@Test
	public void one_subList() {
		
		listNumbers = Partition.partition(subList, 1);
		assertEquals(listNumbers.size(), 10);
	}
	
	@Test
	public void two_subList() {
		listNumbers = Partition.partition(subList, 2);
		assertEquals(listNumbers.size(), 5);
	}
	
	@Test
	public void three_subList() {
		listNumbers = Partition.partition(subList, 3);
		assertEquals(listNumbers.size(), 4);
	}
	
	@Test
	public void four_subList() {
		listNumbers = Partition.partition(subList, 4);
		assertEquals(listNumbers.size(), 3);
	}
	
	
	
	

}
