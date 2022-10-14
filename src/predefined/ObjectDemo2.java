package predefined;

public class ObjectDemo2 {

	public String toString() {
		return "Hi I am overriding toString() of Object Class";
	}
	
	public int hashCode() {
		return 1234;
	}
	

	public static void main(String[] args) {
		
		ObjectDemo2 ref = new ObjectDemo2();
		
		System.out.println(ref.toString());
		
		System.out.println(ref.hashCode());

	}

}
