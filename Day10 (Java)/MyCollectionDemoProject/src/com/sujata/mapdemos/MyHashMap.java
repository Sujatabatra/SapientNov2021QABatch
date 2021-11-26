package com.sujata.mapdemos;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class MyHashMap {

	public static void main(String[] args) {
		//unordered collection of key- value pairs,
		//Keys are unique and values can be duplicated
//		and unordering is wrt key
		Map<String, Integer> months=new HashMap<String, Integer>();
		months.put("Jan", 31);
		months.put("Feb", 28);
		months.put("Mar", 78);
		months.put("Apr", 42);
		months.put("May", 90);
		
		System.out.println(months);
		months.put("Feb", 29);
		System.out.println(months);
		
		Set<String> keys=months.keySet();
		for(String month:keys) {
			System.out.println(month+" have "+months.get(month)+" days");
		}

	}

}
