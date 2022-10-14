package variable;

public class variables5 {
	   
	   double salary = 75989.708;  //NSGV
	   
	   static int age = 15; 

	   public static void main(String args[]) {
		   
	      variables5 empOne = new variables5(); //Object of Variable5 Class
	    
	      System.out.println("salary :" + empOne.salary); //75989.708
	      
		  empOne.salary = 85000.78; //re-initialized salary variable
		  
		  System.out.println("salary :" + empOne.salary); //85000.78
		  
		  variables5 empOne1 = new variables5();  //Second Object of Variable5 Class
		  System.out.println("salary :" + empOne1.salary); //75989.708
		  empOne1.salary = 9000;
		  System.out.println("salary :" + empOne1.salary);
		  variables5 empOne2 = new variables5();
		  System.out.println("salary :" + empOne2.salary);
		  ageMethod();
		  
	   }
	   
	   
	   static void ageMethod() {
		   System.out.println(age);
	   }
	   
	   
}

/* 
 * Multiple line comments
 */

// Single line comment











