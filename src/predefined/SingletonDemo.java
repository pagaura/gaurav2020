package predefined;

//Singleton Class
class Singleton {
	
	public String s;
	
	private static Singleton ref_Single = new Singleton();
	
	private Singleton() {
		s = "This is a singleton constructor";
	}
	
	public static Singleton singleMethod() {
		return ref_Single;
	}

	
}


//Normal class
public class SingletonDemo {
	
	static void display() {
		System.out.println("display method of singleton Demo");
	}
	
	public static void main(String[] args) {
		
		//Singleton s1 = new Singleton();   //compile time error
		
		
		//singleMethod();  //Can not call directly by name bcz static method is in another class
		Singleton.singleMethod();  
		//classname.methodname
		
		
		//display();   //Call directly by name bcz static method is in same class
		SingletonDemo.display();

	}

}
