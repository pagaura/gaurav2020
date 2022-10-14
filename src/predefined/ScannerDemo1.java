package predefined;

import java.util.Scanner;

public class ScannerDemo1 {

	public  static void main(String[] args) {
		//	int age = 30;
		//	String name = "Rohit";
		//	double salary = 45000.00;
			
			Scanner scanRef = new Scanner(System.in);
			int age;
			String name;
			double salary;
			double bonus;
			char bloodgroup;
			
		
			System.out.println("Please enter value in age");
			age = scanRef.nextInt();  //To read int
			System.out.println("Age is " + age);
			
			System.out.println("Please enter your name");
			name = scanRef.next();   //To read String
			System.out.println("Name is " + name);
			
			System.out.println("Please enter your salary");
			salary = scanRef.nextDouble();   //To read double
			System.out.println("Salary is " + salary);
			
			System.out.println("Please enter your bonus");
			bonus = scanRef.nextDouble();   //To read double
			System.out.println("Bonus is " + bonus);
			
			System.out.println("Please enter your bloodgroup");
			bloodgroup = scanRef.next().charAt(0);   //To read char
			System.out.println("BloodGroup is " + bloodgroup);
			
			
			//byte , short, long, float

		}
}
