package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistDemo5 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("Mango");  
		list.add(100);
		list.add(200.50);
		list.add('A');
		list.add(4, 55.7f);
		
		Collections.sort(list);  
		System.out.println("Ascending Order " + list);
			
		//Sorting will not work here, it will give exception. Because sort method works on comparing values of similar object/element
		
	}

}