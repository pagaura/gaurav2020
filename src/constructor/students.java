package constructor;

public class students {
	
	public students() {
		
		System.out.println("Hi I am constructor");	
	}
	
	students(String name) {
		
		System.out.println("Hi I am Parameterized constructor");
		System.out.println(name);
	}
	
	

	public static void main(String[] args) {
		
		students ref = new students(); //call Zero Parameter constructor
		
		students ref1 = new students("Rohit"); //call Parameterized constructor
		
		System.out.println("HI I am main method");
		
		//ref.display();
		//ref.display(10);
		
	}
	
	
	void display() {
		
	}
	
	void display(int num) {
		System.out.println(num);
	}

}

//Default Constructor -- It is created by Java

//User defined constructor  -- It is created/written by programmer
