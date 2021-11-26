package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.sujata.bean.Person;

public class MyHashSetForPerson {

	public static void main(String[] args) {
		//unordered unique collection of objects
		Set<Person> myCollection=new HashSet<Person>();
		
		myCollection.add(new Person(101,"AAAA"));
		myCollection.add(new Person(102,"BBBB"));
		myCollection.add(new Person(103,"CCCC"));
		myCollection.add(new Person(104,"DDDD"));
		myCollection.add(new Person(101,"AAAA"));
		
		System.out.println(myCollection);
		System.out.println("Size of Collection :"+myCollection.size());
		
		myCollection.add(new Person(105,"EEEE"));
		System.out.println("Size of collection after adding 89:"+myCollection.size());
		System.out.println("Traversal yusing for each");
		for(Person obj:myCollection) {
			System.out.println(obj);
		}
		myCollection.remove(19);
		System.out.println("Size of collection after removing 19 : "+myCollection.size());
		
		System.out.println("Traversal using iterator");
		Iterator<Person> iterator=myCollection.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		

	}

}
