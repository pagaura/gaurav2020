package pattern;

public class pattern1 {

	public static void main(String[] args) {
		
		for(int i=1 ; i<=5; i++) {  //3
			
			for(int j=1; j<(i*2); j++) {
				System.out.print("*"); //1 //2
			}
			
			System.out.println();
			//System.out.println(i);
			
		}

	}

}