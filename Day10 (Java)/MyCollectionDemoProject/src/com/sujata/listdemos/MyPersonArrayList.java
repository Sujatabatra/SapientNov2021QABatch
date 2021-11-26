package com.sujata.listdemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import com.sujata.bean.Person;

public class MyPersonArrayList {

	public static void main(String[] args) {
		//ordered duplicate collection of objects
		ArrayList<Person> list=new ArrayList<Person>();
		
		list.add(new Person(101, "AAAA"));
		list.add(new Person(102, "BBBB"));
		list.add(new Person(103, "CCCC"));
		list.add(new Person(104, "DDDD"));
		list.add(new Person(101, "AAAA"));
		
		System.out.println(list);
		System.out.println("Size of List : "+list.size());
		
		System.out.println("Traversal using traditional for loop");
		for(int index=0;index<list.size();index++) {
			System.out.println(list.get(index));
		}
		
		System.out.println("Traversal using for each ");
		for(Person element:list) {
			System.out.println(element);
		}
		
		System.out.println("Reverse Traversal using iterator");
		Iterator<Person> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		System.out.println("Traversal using List Iterator");
		ListIterator<Person> listIterator=list.listIterator();
		while(listIterator.hasNext()) {
			listIterator.next();
		}
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

}
