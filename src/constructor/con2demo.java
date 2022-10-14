package constructor;

public class con2demo {
	
	con2demo()  {
		
		
		this(2,"gaurav pathade");
		
		System.out.println("hi i am nashikkar....");
	}
	
	con2demo(int roll_no, String name){
		
		this("international college");
        
		System.out.println("Roll No is " + roll_no);
		
		System.out.println("Name is " + name);
		
	}
	
       con2demo(String college) {
		
		System.out.println("college is " + college);
      
       }
		

	public static void main(String[] args) {
		

		con2demo m1= new con2demo();
	}

}
