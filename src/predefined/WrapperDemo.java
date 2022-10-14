package predefined;

public class WrapperDemo {

	public static void main(String[] args) {
		
		//int a = 20;   //primitive datatype
		
		//classname ref_variable = new classname();
		
		//Boxing
		//Integer k = new Integer(a);  //converting int datatype into Integer Object (explicity) -- boxing
		
		//System.out.println(k);
		
		Integer k1 = new Integer(30);
		//System.out.println(k1);
		
		//Unboxing
		int a1 = k1.intValue();    //converting Integer Object into int datatype (explicity) -- unboxing
		
		System.out.println(a1);

	}

}