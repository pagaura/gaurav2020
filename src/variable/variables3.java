package variable;

public class variables3 {
	
	int age = 30; //NSGV
	
	static String name = "Rohit Sharma";  //SGV

	public static void main(String[] args) {
		
		display();
	
	}
	
	//static method
	static void display() {
		
		variables3 ref = new variables3();
		
		System.out.println(ref.age);   //calling NSGV
		System.out.println(name);  //calling SGV	
		
	}
	
	static void display1() {
		
		variables3 ref = new variables3();
		
		System.out.println(ref.age);   //calling NSGV
		System.out.println(name); 
		
	}
	
	

}