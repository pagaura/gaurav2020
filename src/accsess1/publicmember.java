package accsess1;

public class publicmember {
public void display( ) {
		
	}

	public static void main(String[] args) {
		publicmember ref = new publicmember();
		ref.display();
	}

}


class Test_P extends publicmember  {
	
	public static void main(String[] args) {
		publicmember ref = new publicmember();
		ref.display();
	}
	
}

