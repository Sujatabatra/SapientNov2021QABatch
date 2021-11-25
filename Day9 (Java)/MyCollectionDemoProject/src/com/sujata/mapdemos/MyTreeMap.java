package com.sujata.mapdemos;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MyTreeMap {

	public static void main(String[] args) {
		//Sorted collection of key- value pairs,
		//Keys are unique and values can be duplicated
//		and sorting wrt key
		Map<String, Integer> months=new TreeMap<String, Integer>();
		months.put("Jan", 31);
		months.put("Feb", 28);
		months.put("Mar", 31);
		months.put("Apr", 30);
		months.put("May", 31);
		
		System.out.println(months);
		months.put("Feb", 29);
		System.out.println(months);
		
		Set<String> keys=months.keySet();
		for(String month:keys) {
			System.out.println(month+" have "+months.get(month)+" days");
		}

	}

}
