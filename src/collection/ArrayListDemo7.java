package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo7 {

public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("Mango");  
		list.add("Grapes");
		list.add("Apple");
		list.add("Orange");
		
		//Iterator
		System.out.println("Traversing list through Iterator");
		Iterator itr = list.iterator();
		
		//Iterator object can be use to iterate a collection only once
		//For second Iteration create new Iterator object
		
		/*
		System.out.println(itr.hasNext());  //true
		System.out.println(itr.next());   //Mango
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());  //false
		*/
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		/* Below code will work, but kindly ignore below code
		for( ; itr.hasNext() ; ) {
			System.out.println(itr.next());
		}
		*/
	}

}
