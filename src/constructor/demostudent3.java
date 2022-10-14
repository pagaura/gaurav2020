package constructor;

public class demostudent3 {
       
	int salary;
	
	String companyname;
	
	
	public static void main(String[] args) {
		
		demostudent3 m1 = new demostudent3();
				m1.display(20000,"wipro");
                m1.display1(); 
	}
	
	void display(int salary, String companyname) {
		this.salary = salary;
		this.companyname = companyname;
		
		
	} 
	
	void display1()  {
		
		System.out.println("salary is " + salary);
		System.out.println("companyname is " + companyname);
	}
	
	
//this (),.....this statment.....cons to cons...
	//this.=.....keywords........cons to cons  & method to method & cons to method  //not using method to cons.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
