package predefined;

public class StringDemo2 {

	public static void main(String[] args) {

		String str = "Welcome";     //by using literals
		String str1 = "Welcome";
		String str_new = "WELCOME";
		
		String str2 = new String("Welcome");    //by using new keyword
		String str3 = new String("Welcome");
		
		//Compare on the basis address
		
		System.out.println(str==str1);     //true
		System.out.println(str==str_new);    //false

		System.out.println(str2==str3);   //false 
	}

}