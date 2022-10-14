package predefined;

class Print {
	
	int a = 10; 
	//int b = 20;
	
	public boolean equals(Object obj) {
		Print p = (Print) obj;
		return (this.a==p.a);    //10==10
	}
	
}


public class ObjectDemo3 {

	public static void main(String[] args) {

		ObjectDemo3 ref = new ObjectDemo3();
		
		ObjectDemo3 ref1 = new ObjectDemo3();
		
		System.out.println("Compare " + ref.equals(ref1));  //Compare address
		
		Print p1 = new Print();
		
		Print p2 = new Print();
		
		System.out.println("Compare " + p1.equals(p2));  //Compare values

	}

}