package variable;

public class variable2 {

	public static void main(String[] args) {
		
		System.out.println("Hi, I am main method");
		
		display();  //call static method
		//or
		//variable2.display(); //call static method via classname
		
		variable2 m1 = new variable2(); 
		
		m1.show();  //call non static method using object
	
	}
	
	//static method
	static void display() {	
		
		System.out.println("Hi, I am static method. My name is display");
	}
	
	//non static method
	void show() {
		
		System.out.println("Hi, I am non static method. My name is show");
		
	}
	

}