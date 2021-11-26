package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet {

	public static void main(String[] args) {
		//unordered unique collection of objects
		Set<Integer> myCollection=new HashSet<Integer>();
		
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
