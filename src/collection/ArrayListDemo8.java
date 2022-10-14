package collection;

import java.util.ArrayList;

public class ArrayListDemo8 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("Mango");  
		list.add("Grapes");
		list.add("Apple");
		list.add("Orange");
		//list.add(5000);
		System.out.println("Using for each method");
		
		//this is a new feature, introduced in Java 8
		
		//Passing lamba expression in argument
		list.forEach(
		i -> {
			System.out.println(i);
		}
		);
		
		//Syntax of Lamba expression
		/*
	    () -> {  
	        //Body of no parameter lambda  
	        }  
		*/
	

	}
	
	

}