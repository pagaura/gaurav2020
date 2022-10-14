package collection;

import java.util.ArrayList;

public class ArrayListDemo4 {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Mango");  
		list1.add("Grapes");
		list1.add("Orange");
		//list1.add(6000);   //Only String is allowed in list1
		
		ArrayList list2 = new ArrayList();
		list2.add("Apple");  
		list2.add(5000);
		
		list1.addAll(list2);
		
		System.out.println(list1);    //Once two list are merged, it will consider as global
		
	}

}