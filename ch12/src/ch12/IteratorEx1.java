package ch12;

import java.util.*;

public class IteratorEx1 {

	public static void main(String[] args) {
		Collection list = new TreeSet();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("6");
		list.add("7");
		list.add("9");
		list.add("4");
		list.add("10");
		list.add("8");
		
		//읽어와보자!
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
