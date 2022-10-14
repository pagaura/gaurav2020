package predefined;

import java.lang.Double;

public class WrapperDemo2 {

	public static void main(String[] args) {

		//Boxing
		double d = 20.50;
		Double d1 = new Double(d);
       // double e = 25.25;
        //Double e1 = new Double(e);
		
		//Unboxing
		Double i = new Double(30.70);
		double i1 = i.doubleValue();

		System.out.println(d);
	}

}