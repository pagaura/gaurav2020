package collection;

import java.util.HashSet;

public class SetDemo2 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		set.add("Ankesh");
		set.add(500);
		set.add(700);
		set.add("Rohit");
		
		System.out.println("Set1 collection");
		for(Object i : set) {
			System.out.println(i);
		}
		
		System.out.println();
		
		HashSet set2 = new HashSet();
		set2.addAll(set);
		set2.add("Virat");
		
		set2.removeAll(set);
		
		System.out.println("Set2 collection");
		for(Object j : set2) {
			System.out.println(j);
		}
		
		

	}

}
