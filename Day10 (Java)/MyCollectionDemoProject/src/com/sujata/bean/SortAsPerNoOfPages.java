package com.sujata.bean;

import java.util.Comparator;

public class SortAsPerNoOfPages implements Comparator<MyBook> {

	@Override
	public int compare(MyBook book1, MyBook book2) {
		if(book1.getNoOfPages()>book2.getNoOfPages())
			return 1;
		else if(book1.getNoOfPages()<book2.getNoOfPages())
			return -1;
		return 0;
	}

}
