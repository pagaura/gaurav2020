package collection;

import java.util.HashSet;

public class SetDemo1 {

	public static void main(String[] args) {

		HashSet set = new HashSet();
		set.add("mango");
		set.add(500);
		set.add("pranit");
		set.add(700);
		set.add("pranit");
		set.add(700);
		

	System.out.println(set);
	}
}