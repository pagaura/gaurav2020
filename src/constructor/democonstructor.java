package constructor;

public class democonstructor {

	   int age;
	   
	   String city;
	   
	   democonstructor() {
		   
		   System.out.println("hi i am democonstructor");
		   
	   }  
	   
	   democonstructor(int age, String city ) { 
		   
		   this();
		   
		   System.out.println("age is " + age);
		   
		   System.out.println("city is " + city);
	
		   
		   
		   
	   }
	   
	   
	public static void main(String[] args) {
		
		
		democonstructor a1 = new democonstructor(30, "chandrapur");


	}

}
