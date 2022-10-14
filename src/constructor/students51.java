package constructor;

public class students51 {
	
	static int roll_no = 7;  //NSGV
	static String name = "Dhoni";  //NSGV
	
	students51(int roll_no, String name) {
		
		this.roll_no = roll_no;
		
		this.name = name;
		
		this.display();
		
	}
	
	static void display() {
		
		System.out.println("Roll No is " + roll_no);
		
		System.out.println("Name is " + name);
	}
	
	static void display1() {
		
		display();
		
	}
	

	public static void main(String[] args) {
		
		//students5 m1 = new students5(20, "Virat");
		//students5 m2 = new students5(7, "dhoni");
		display();
		display1();
		//students5 m1 = new students5();

	}

}

// Constructor to Constructor ----- this()  - this statement

// Constructor to Method ------- this.methodname()   --- this keyword

//--------------

// Method to Method ----- this.methodname()   --- this keyword

// Method to Constructor using this keyword or this statement  --- Not allowed
// In method if you want to call constructor then we need to create object



