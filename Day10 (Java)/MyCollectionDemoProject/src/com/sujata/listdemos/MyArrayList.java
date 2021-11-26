package com.sujata.listdemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MyArrayList {

	public static void main(String[] args) {
		//ordered duplicate collection of objects
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(7);
		list.add(20);
		list.add(59);
		list.add(10);
		
		System.out.println(list);
		System.out.println("Size of List : "+list.size());
		
		System.out.println("Traversal using traditional for loop");
		for(int index=0;index<list.size();index++) {
			System.out.println(list.get(index));
		}
		
		System.out.println("Traversal using for each ");
		for(Integer element:list) {
			System.out.println(element);
		}
		
		System.out.println("Reverse Traversal using iterator");
		Iterator<Integer> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		System.out.println("Traversal using List Iterator");
		ListIterator<Integer> listIterator=list.listIterator();
		while(listIterator.hasNext()) {
			listIterator.next();
		}
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

}
