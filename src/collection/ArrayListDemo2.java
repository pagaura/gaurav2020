package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		list1.add("Mango");  
		list1.add("Grapes");
		list1.add("Apple");
		list1.add("Orange");
		
	    //Collections.sort(list1);   //Sorting in Ascending Order
		//System.out.println("Ascending Order " + list1);
		
		Collections.reverse(list1);   //Sorting in Reverse Order
		//System.out.println("Descending / Reverse " + list1);
		
		ArrayList list2 = new ArrayList();
		list2.add("Pineapple");
		list2.add("Watermelon");
		
		System.out.println("Before adding list2 in list1 " + list1);

		list1.addAll(list2);
		
		System.out.println("After adding list2 in list1 " + list1);
		
		list1.retainAll(list2);
		
		System.out.println("After Retaining list1 " + list1);
		
	}

}
