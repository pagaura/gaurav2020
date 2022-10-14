package ifConditions;

public class ifStatement {

	public static void main(String[] args) {
		
		System.out.println("process start");
     
		int age = 18;
        
        if(age>=18) {
    	 System.out.println("eligible for driving license");
     }
        if(age<18) {
    	 System.out.println("not eligible for driving license");
        }
        if(age==18) {
        	System.out.println("also eligible for driving license");
        }
          System.out.println("process ends here");
	}		

}
