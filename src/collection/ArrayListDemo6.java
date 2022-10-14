package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo6 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(500);  
		list.add(100);
		//list.add(200.50);
		list.add(700);
		
		Collections.sort(list);  
		System.out.println("Ascending Order " + list);

	}

}