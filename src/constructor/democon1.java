package constructor;

public class democon1 {
	  
	int age;
	
	String name;
	
	int roll_no;
	
     democon1(int age, String name) {
    	 
    	 //this();
    	 
    	 System.out.println("age is "+ age );
    	 System.out.println("name is "+name);
    	 System.out.println("roll no is "+ roll_no);
    	 
     }
	
  democon1(String city, int salary , int weight) {
    	 
    	 super();
    	 
    	 System.out.println("city is "+ city);
    	 System.out.println("salary is "+ salary );
    	 System.out.println("weight no is "+ weight);
    	 
     }
	public static void main(String[] args) {
		
		democon1 m1 = new democon1(30,"sanvi"2223);
		democon1 m1 = new democon1("nashik",25000,56)
		
		

	}

}
