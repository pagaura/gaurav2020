package variable;

public class Assignment2b {
 
	int num = 150, num1=100;
	
	public static void main(String[] args) {
		Assignment2b m1 = new Assignment2b();
        System.out.println("addition is "+ m1.addition());
        System.out.println("substraction is " + m1.substraction());
        System.out.println("multiplication is " + m1.multiplication());
        System.out.println("division is " + m1.division());
        System.out.println("modulus is " + m1.modulus());
	}
	int addition() {
	int addition = num + num1;
	return addition;
	
	}
	long substraction() {
		long substraction = num - num1;
		return substraction;
	}
	float multiplication() {
		float multiplication = num * num1;
		return multiplication;
	}
	double division() {
		double division = num / num1;
		return division;
	}
	long modulus() {
		long modulus = num % num1;
		return modulus;
	}
	
}
	

