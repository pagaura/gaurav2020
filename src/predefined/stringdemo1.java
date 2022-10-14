package predefined;

public class stringdemo1 {

	public static void main(String[] args) {
		String str = "Welcome";     //by using literals
		String str1 = "Welcome";
		
		String str2 = new String("Welcome by");    //by using new keyword
		String str3 = new String("Welcome"); 
		
		//System.out.println(str);
		//System.out.println(str1);
		
		//System.out.println(str.toString());
		//System.out.println(str2.toString());
		
		System.out.println(str.equals(str1));    //false
		System.out.println(str2.equals(str3));
		//System.out.println(str.equals(str2));
	}

}