package predefined;

public class ObjectDemo1 {

public static void main(String[] args) {
		
		ObjectDemo1 ref = new ObjectDemo1();
		
		//System.out.println(ref);   //ref.toString()  -- automatically it will be considered by java compiler
		
		//System.out.println(ref.toString());  //representation of an object
		
		//System.out.println(ref.hashCode());  //memory address in decimal
		
		
		ObjectDemo1 ref1 = new ObjectDemo1();
		
		//System.out.println(ref1.toString());  //representation of an object
		
		//System.out.println(ref1.hashCode()); 
		
		
		//System.out.println("Compare between ref and ref1 : " + ref.equals(ref1));
		
		
		ObjectDemo1 ref2 = ref1;
		
		//System.out.println(ref2.hashCode()); 
		
		System.out.println("Compare between ref2 and ref1 : " + ref2.equals(ref1)); // compare object on the basis of memory address		
		
		if(ref2==ref1) {
			System.out.println("Objects are same");
		}
		else {
			System.out.println("Objects are not same");
		}
		
		
	}

}