package com.sujata.setdemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.sujata.bean.Book;
import com.sujata.bean.MyBook;
import com.sujata.bean.SortAsPerNoOfPages;
import com.sujata.bean.SortyAsPerAuthorName;

public class MyTreeSetForMyBooks {

	public static void main(String[] args) {
		//Sorted unique collection of objects
		Set<MyBook> myCollection=new TreeSet<MyBook>(new SortyAsPerAuthorName());
		
		myCollection.add(new MyBook(101, "Book1", "Author A", 750, 1000));
		myCollection.add(new MyBook(102, "Book2", "Author A", 650, 5000));
		myCollection.add(new MyBook(103, "Book3", "Author Z", 900, 800));
		myCollection.add(new MyBook(104, "Book4", "Author B", 370, 780));
		myCollection.add(new MyBook(101, "Book1", "Author A", 750, 1000));
		
		System.out.println(myCollection);
		System.out.println("Size of Collection :"+myCollection.size());
		
		myCollection.add(new MyBook(105, "Book5", "Author M", 1750, 1200));
		System.out.println("Size of collection after adding 89:"+myCollection.size());
		System.out.println("Traversal yusing for each");
		for(MyBook obj:myCollection) {
			System.out.println(obj);
		}
		myCollection.remove(new MyBook(101, "Book1", "Author A", 750, 1000));
		System.out.println("Size of collection after removing 19 : "+myCollection.size());
		
		System.out.println("Traversal using iterator");
		Iterator<MyBook> iterator=myCollection.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		

	}

}
