package variable;

public class Assignment1 {

	static int Ram = 40, Sham = 30;
			
	public static void main(String[] args) {
		Assignment1 m1 = new Assignment1();
		m1.addition();
        m1.substraction();
        m1.multiplication();
        division();
        modulus();
        
	}
	
	void addition() {
		int addition = Ram + Sham;
		System.out.println("addition is "+ addition);
		
	}
    void substraction() {
    	int substraction = Ram - Sham;
    	System.out.println("substraction is "+substraction);
    }
    void multiplication() {
    	int multiplication = Ram * Sham;
    	System.out.println("multiplication is "+multiplication);
    }
    static void division() {
    	int division = Ram / Sham;
    	System.out.println("division is " +division);
    }
    static void modulus() {
    	int modulus = Ram % Sham;
    	System.out.println("modulus is " +modulus);
    }
}
