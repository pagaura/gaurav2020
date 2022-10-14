package collection;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		//classname ref_variable = new classname();
		
		ArrayList list = new ArrayList();
		list.add("Mango");  //Automatic conversion from type to Object
		list.add(100);
		list.add(200.50);
		list.add('A');
		list.add(4, 55.7f);
		
		System.out.println(list.get(3));   //55.7
		
		list.set(2, 5000.50);
		
		//System.out.println(list.get(2));
		
		//System.out.println("Size of a list " + list.size());   //4
		
		//Using for loop
		/*
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		*/
	
		//Using for each loop
		/*
		for(Object i : list) {
			System.out.println(i);
		}
		*/
		
	}

}