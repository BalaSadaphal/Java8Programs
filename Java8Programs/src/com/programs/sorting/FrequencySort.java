package com.programs.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FrequencySort {
	public static void main(String[] args) {
//	I/P=>   1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 6, 6, 6, 7, 8, 9, 10
//			1-1,2-2,3-3,4-2,5-4,6-3,7-1,8-1,9-1,10-1,
		
//	O/P=>	5-4,3-3,6-3,2-2,4-2,1-1,7-1,8-1,9-1,10-1,
		
		List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 6, 6, 6, 7, 8, 9, 10);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int element : list) {
			int value = 1;
			Integer prev_value = map.put(element, value);
			value = prev_value == null ? 0 : prev_value;
			map.put(element, value + 1);
		}

		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + ",");
		}

		List<Map.Entry<Integer, Integer>> list1 = new ArrayList<Entry<Integer, Integer>>(
				(Collection<? extends Entry<Integer, Integer>>) map.entrySet());

		Collections.sort(list1, (Entry<Integer, Integer> o1,Entry<Integer, Integer> o2) -> -(o1.getValue())
				.compareTo(o2.getValue()));

		System.out.println();
        for (Map.Entry<Integer, Integer> aa : list1) { 
        	System.out.print(aa.getKey() + "-" + aa.getValue() + ",");
        } 
	}

}