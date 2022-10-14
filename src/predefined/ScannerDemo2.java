package predefined;

import java.util.Scanner;

public class ScannerDemo2 {

public static void main(String[] args) {
		
		Scanner scanRef = new Scanner(System.in);
		
		System.out.println("Enter Num1");
		int num1 = scanRef.nextInt();
		
		System.out.println("Enter Num2");
		int num2 = scanRef.nextInt();
		
		System.out.println("Enter Operator");
		char ch = scanRef.next().charAt(0);
		
		Calculation(ch, num1, num2);

	}
	
	public static void Calculation(char ch, int num1, int num2) {
		
		if(ch=='+') {
			int addition = num1 + num2;
			System.out.println(addition);
		} 
		else if(ch=='-') {
			int substraction = num1 - num2;
			System.out.println(substraction);
		}
		else if(ch=='*') {
			int multiplication = num1 * num2;
			System.out.println(multiplication);
		}
		else {
			System.out.println("Please enter valid operator");
		}
		
	}

}

// multiplication, division, modulus