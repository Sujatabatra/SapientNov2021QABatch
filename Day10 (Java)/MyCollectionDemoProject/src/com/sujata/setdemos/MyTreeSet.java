package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {

	public static void main(String[] args) {
		//Sorted unique collection of objects
		Set<Integer> myCollection=new TreeSet<Integer>();
		
		myCollection.add(10);
		myCollection.add(50);
		myCollection.add(25);
		myCollection.add(19);
		myCollection.add(10);
		
		System.out.println(myCollection);
		System.out.println("Size of Collection :"+myCollection.size());
		
		myCollection.add(89);
		System.out.println("Size of collection after adding 89:"+myCollection.size());
		System.out.println("Traversal yusing for each");
		for(Integer obj:myCollection) {
			System.out.println(obj);
		}
		myCollection.remove(19);
		System.out.println("Size of collection after removing 19 : "+myCollection.size());
		
		System.out.println("Traversal using iterator");
		Iterator<Integer> iterator=myCollection.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		

	}

}
