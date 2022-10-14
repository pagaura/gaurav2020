package variable;

public class Assignment2 {
 
	int Num1 = 120, Num2 = 100;
	
	public static void main(String[] args) {
		System.out.println("addition is " + addition());
		System.out.println("substraction is "+ substraction());
		System.out.println("multiplication is "+ multiplication());
		System.out.println("division is " + division());
		System.out.println("modulud is "+ modulus());

	}
	static int addition(){
		Assignment2 m1 = new Assignment2();
		int addition = m1.Num1 + m1.Num2;
		return addition;
	}
	static long substraction() {
		Assignment2 m1 = new Assignment2();
		int substraction = m1.Num1 - m1.Num2;
		return substraction;
	}
   static double multiplication() {
	   Assignment2 m1 = new Assignment2();
		int multiplication = m1.Num1 * m1.Num2;
		return multiplication;
   }
   static float division() {
	   Assignment2 m1 = new Assignment2();
		int division = m1.Num1 / m1.Num2;
		return division;
   }
   static long modulus() {
	   Assignment2 m1 = new Assignment2();
		int modulus = m1.Num1 % m1.Num2;
		return modulus;
   }
}
