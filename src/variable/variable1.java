package variable;

public class variable1 {
	
	int age = 15; //Non static global variable or Instance variable
	
	static double salary = 40000.50; //Static global variable

	public static void main(String[] args) {
		
		//System.out.println(variables1.age); //this code will not work
		
		//classname reference = new classname();   
		variable1 ref = new variable1();   //object
		
		System.out.println(ref.age);  //calling NSGV via object
		
		System.out.println(salary); //calling SGV directly
		//or
		System.out.println(variable1.salary);   //calling SGV by classname
		

	}

}