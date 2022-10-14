package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {

public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		
		set.add(7000);
		set.add(500);
		set.add(700);
		set.add(700); //Duplicate
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}